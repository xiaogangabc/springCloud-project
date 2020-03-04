package com.modules.account.service.impl;

import com.modules.account.entity.Address;
import com.modules.account.mapper.AddressMapper;
import com.modules.account.service.IAddressService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 *  服务实现类
 */
@Service
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements IAddressService {

}
