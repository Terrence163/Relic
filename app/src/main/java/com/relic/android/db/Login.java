package com.relic.android.db;

import org.litepal.annotation.Encrypt;
import org.litepal.crud.DataSupport;

/**
 * Created by 陶士超 on 2017/12/20.
 */

public class Login extends DataSupport {
    private User mUser;
    private String email;
    private String phoneNumer;
    @Encrypt(algorithm = AES)
    private String password;

    public User getUser() {
        return mUser;
    }

    public void setUser(User user) {
        mUser = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumer() {
        return phoneNumer;
    }

    public void setPhoneNumer(String phoneNumer) {
        this.phoneNumer = phoneNumer;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
