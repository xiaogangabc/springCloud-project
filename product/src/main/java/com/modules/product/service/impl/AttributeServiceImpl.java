package com.modules.product.service.impl;

import com.modules.product.entity.Attribute;
import com.modules.product.mapper.AttributeMapper;
import com.modules.product.service.IAttributeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 *  服务实现类
 */
@Service
public class AttributeServiceImpl extends ServiceImpl<AttributeMapper, Attribute> implements IAttributeService {

}
