package com.relic.android.db;

import org.litepal.annotation.Column;
import org.litepal.annotation.Encrypt;
import org.litepal.crud.DataSupport;

/**
 * Created by Terrence on 2017/12/20.
 */

public class Login extends DataSupport {
    @Column(unique = true)
    private String email;
    @Encrypt(algorithm = AES)
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
