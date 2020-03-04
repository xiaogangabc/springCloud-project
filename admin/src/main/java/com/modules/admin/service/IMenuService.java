package com.modules.admin.service;

import com.modules.admin.entity.Menu;
import com.baomidou.mybatisplus.extension.service.IService;
import com.modules.admin.util.R;

import java.util.Map;

/**
 *  服务类
 */
public interface IMenuService extends IService<Menu> {

    public R getMenu(int pid);

    public R getOrder(Map<String,Object> map);


}
