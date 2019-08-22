package com.bfbm.annotation.normalAnnocationTest;



/**
 * 使用注解：
 *
 * */
public class PasswordUtils {
    @UseCases(id="47",description="Passwords must contain at least one numeric",id2=1)
    public boolean validatePassword(String password) {
        return (password.matches("\\w*\\d\\w*"));
    }

    @UseCases(id ="48")
    public String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }
}