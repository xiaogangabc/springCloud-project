package com.modules.product.service.impl;

import com.modules.product.entity.Spec;
import com.modules.product.mapper.SpecMapper;
import com.modules.product.service.ISpecService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 *  服务实现类
 */
@Service
public class SpecServiceImpl extends ServiceImpl<SpecMapper, Spec> implements ISpecService {

}
