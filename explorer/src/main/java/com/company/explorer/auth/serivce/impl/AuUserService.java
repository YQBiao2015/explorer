package com.company.explorer.auth.serivce.impl;

import com.company.explorer.auth.dao.IAuUserDao;
import com.company.explorer.auth.entity.AuUser;
import com.company.explorer.auth.repository.AuUserRepository;
import com.company.explorer.auth.serivce.IAuUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yangqibiao on 2018/3/8.
 */
@Service
public class AuUserService implements IAuUserService {
    @Resource
    IAuUserDao auUserDao;

    @Override
    public AuUser get(Integer id) {
        return auUserDao.get(id);
    }

}
