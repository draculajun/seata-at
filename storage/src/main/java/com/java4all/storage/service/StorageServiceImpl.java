package com.java4all.storage.service;

import com.java4all.storage.dao.StorageDao;
import io.seata.spring.annotation.GlobalTransactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("storageServiceImpl")
public class StorageServiceImpl implements StorageService{

    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Autowired
    private StorageDao storageDao;

    /**
     * 扣减库存
     * @param productId 产品id
     * @param count 数量
     * @return
     */
    @Override
    @GlobalTransactional
    public void decrease(Long productId, Integer count) {
        LOGGER.info("------->扣减库存开始");
        storageDao.decrease(productId,count);
        LOGGER.info("------->扣减库存结束");
    }
}
