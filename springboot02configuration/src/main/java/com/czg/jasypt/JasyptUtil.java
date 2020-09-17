package com.czg.jasypt;

import org.jasypt.util.text.BasicTextEncryptor;

//加密
public class JasyptUtil {

    public static void main(String[] args) {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword("123456!@#");
        String username = textEncryptor.encrypt("root");
        String password = textEncryptor.encrypt("root123");
        System.out.println(username);
        System.out.println(password);
        //3NRK48MHF6Q9+bXjw/cRlQ==
        //JvpIukHyMGMP85vxtryEhA==

        //sC6P2Ahj2E6bZi5ybayonQ==
        //wQQPO3QVeBD5l4ECChAHfg==
    }
}
