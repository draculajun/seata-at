package com.java4all.account.service;

import com.java4all.account.dao.AccountDao;
import io.seata.spring.annotation.GlobalTransactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service("accountServiceImpl")
public class AccountServiceImpl implements AccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Autowired
    private AccountDao accountDao;

    /**
     * 扣减账户余额
     *
     * @param userId 用户id
     * @param money  金额
     */
    @Override
    @GlobalTransactional
    public void decrease(Long userId, BigDecimal money) {
        LOGGER.info("------->扣减账户开始account中");
        accountDao.decrease(userId, money);
        System.out.println(0 / 0);
        LOGGER.info("------->扣减账户结束account中");
    }
}
