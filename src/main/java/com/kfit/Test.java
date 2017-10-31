package com.kfit;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * 密码加密算法测试
 *
 * @author sifu
 */
public class Test {
    public static void main(String[] args) {
        String pass = "123456";
        String username = "admin";
        String salt = username + "8d78869f470951332959580424d4bf4f";
        int hshIterations = 2;//散列次数，相当于md5(md5("123456"))
        Md5Hash md5Hash = new Md5Hash(pass, salt, hshIterations);
        String Md5Pss = md5Hash.toString();
        System.out.println(Md5Pss);
    }
}
