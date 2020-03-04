package com.modules.admin.service.impl;

import com.modules.admin.entity.Role;
import com.modules.admin.mapper.RoleMapper;
import com.modules.admin.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 *  服务实现类
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
