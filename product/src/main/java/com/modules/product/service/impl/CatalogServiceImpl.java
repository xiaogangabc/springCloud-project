package com.modules.product.service.impl;

import com.modules.product.entity.Catalog;
import com.modules.product.mapper.CatalogMapper;
import com.modules.product.service.ICatalogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 *  服务实现类
 */
@Service
public class CatalogServiceImpl extends ServiceImpl<CatalogMapper, Catalog> implements ICatalogService {

}
