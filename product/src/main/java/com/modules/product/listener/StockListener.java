package com.modules.product.listener;

import com.alibaba.fastjson.JSON;
import com.modules.product.service.IProductService;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class StockListener {

    @Autowired
    IProductService service;

    @RabbitListener(queues = "stock_queue",containerFactory = "simpleRabbitListenerContainerFactory")
    public void getStockMessage(Message message, Channel channel) throws Exception{
        System.out.println("接受到了消息"+new String(message.getBody(),"UTF-8"));
        Map<String,Object> map = JSON.parseObject(new String(message.getBody(),"UTF-8"), Map.class);
        map.put("stock",map.get("quantity"));
        map.put("productId",map.get("id"));
        try {
            service.updateStock(map);
            channel.basicAck(message.getMessageProperties().getDeliveryTag(),false);
        } catch (Exception e) {
            channel.basicNack(message.getMessageProperties().getDeliveryTag(),false,false);
            e.printStackTrace();
        }
    }


}