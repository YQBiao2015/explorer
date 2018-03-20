package com.company.explorer.auth.dao;

import com.company.explorer.auth.entity.AuUser;

/**
 * Created by yangqibiao on 2018/3/8.
 */
public interface IAuUserDao {
    AuUser get(Integer Id);
    AuUser getByUserName(String userName);
}
