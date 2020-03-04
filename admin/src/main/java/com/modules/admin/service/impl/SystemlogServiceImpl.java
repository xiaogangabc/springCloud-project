package com.modules.admin.service.impl;

import com.modules.admin.entity.Systemlog;
import com.modules.admin.mapper.SystemlogMapper;
import com.modules.admin.service.ISystemlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 *  服务实现类
 */
@Service
public class SystemlogServiceImpl extends ServiceImpl<SystemlogMapper, Systemlog> implements ISystemlogService {

}
