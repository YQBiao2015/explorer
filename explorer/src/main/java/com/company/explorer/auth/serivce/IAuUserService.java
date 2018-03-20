package com.company.explorer.auth.serivce;

import com.company.explorer.auth.entity.AuUser;

/**
 * Created by yangqibiao on 2018/3/8.
 */
public interface IAuUserService {
    AuUser get(Integer id);
    AuUser getByUserName(String userName);
}
