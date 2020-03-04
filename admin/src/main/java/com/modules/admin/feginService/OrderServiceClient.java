package com.modules.admin.feginService;

import com.modules.admin.util.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient("server-order")
public interface OrderServiceClient {

    @RequestMapping("/getOrder")
    public R getOrder(@RequestParam("page")Object page,@RequestParam("limit") Object limit);

}
