package com.company.explorer.auth.dao.impl;

import com.company.explorer.auth.dao.IAuUserDao;
import com.company.explorer.auth.entity.AuUser;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

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

    @Override
    public AuUser getByUserName(String userName) {
        String hql = "from AuUser where code = :userName";
        Query query = sessionFactory.openSession().createQuery(hql);
        query.setParameter("userName", userName);
        List<AuUser> auUsers = query.list();
        if (auUsers!=null&&auUsers.size()>0){
            return auUsers.get(0);
        }
        return null;
    }


}
