package com.company.explorer.configuration.security;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by yangqibiao on 2018/3/19.
 */
public class MyPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }
}
