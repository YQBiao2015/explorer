package com.company.explorer.auth.dao.impl;

import com.company.explorer.auth.dao.IAuUserDao;
import com.company.explorer.auth.entity.AuUser;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by yangqibiao on 2018/3/8.
 */
@Repository
public class AuUserDao implements IAuUserDao {
    @Resource
    private SessionFactory sessionFactory;
    @Override
    public AuUser get(Integer id) {
        return sessionFactory.openSession().get(AuUser.class, id);
    }
}
