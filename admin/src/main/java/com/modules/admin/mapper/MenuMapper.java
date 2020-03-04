package com.modules.admin.mapper;

import com.modules.admin.entity.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 */
public interface MenuMapper extends BaseMapper<Menu> {

    public List<Menu> getMenuByRole(Map<String,Object> map);

    public  List<String> selectMenuPower(int rid);
}
