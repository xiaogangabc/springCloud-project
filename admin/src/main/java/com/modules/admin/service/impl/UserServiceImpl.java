package com.modules.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.modules.admin.entity.User;
import com.modules.admin.mapper.MenuMapper;
import com.modules.admin.mapper.PrivilegeMapper;
import com.modules.admin.mapper.RoleMapper;
import com.modules.admin.mapper.UserMapper;
import com.modules.admin.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.modules.admin.util.R;
import com.modules.admin.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *  服务实现类
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    MenuMapper menuMapper;


    @Autowired
    RoleMapper roleMapper;

    @Autowired
    RedisUtil redisUtil;

    @Override
    public R getUser(Map<String,Object> map) {
        List<User> users = userMapper.selectByMap(map);
        if (users.size()>0){
            return R.success("success",users.get(0));
        }
        return R.success("success",null);
    }

    @Override
    public R register(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setCreatetime(new Date());
        return R.success("success",userMapper.insert(user));
    }

    @Override
    public R getUserPage(int page,int limit,Map<String,Object> map) {
        QueryWrapper queryWrapper  = new QueryWrapper();
        map.remove("page");
        map.remove("limit");
        queryWrapper.allEq(map,false);
        Page<User> userPage = new Page<>(page, limit);
        IPage iPage = userMapper.selectPage(userPage, queryWrapper);
        return R.success("success",iPage.getRecords()).set("count",iPage.getTotal());
    }

    @Override
    public R addUser(String username,String password,int rid) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setCreatetime(new Date());
        user.setRid(rid);
        return R.success("success").data(userMapper.insert(user));
    }

    @Override
    public R getPowerList(int pid) {
        List<String> list = menuMapper.selectMenuPower(pid);
        redisUtil.set(pid+"",list);
        return R.success("success",list);
    }

    @Override
    public R getRoles() {
        return R.success("success",roleMapper.selectByMap(null));
    }
}
