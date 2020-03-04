package com.modules.account.service.impl;

import com.modules.account.entity.Account;
import com.modules.account.mapper.AccountMapper;
import com.modules.account.service.IAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 *  服务实现类
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {

}
