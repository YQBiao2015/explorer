package com.company.explorer.auth.controller;

import com.company.explorer.auth.entity.AuUser;
import com.company.explorer.auth.serivce.IAuUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by yangqibiao on 2018/3/8.
 */
@RestController
public class AuUserController {
    @Autowired
    private IAuUserService auUserService;

    @RequestMapping(value = "/auth/user/{id}", method = RequestMethod.GET)
    @ResponseBody
    public AuUser getAuUser(@PathVariable Integer id) {
        return auUserService.get(id);
    }
}
