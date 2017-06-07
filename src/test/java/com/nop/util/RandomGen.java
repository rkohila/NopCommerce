package com.nop.util;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Jey
 * Date: 30/05/17
 * Time: 23:43
 * To change this template use File | Settings | File Templates.
 */
public class RandomGen {

   /* public static String randomMailGen(){
        Random random = new Random();
        String randomEmail= String.valueOf(random.nextInt());
        return randomEmail;
    }*/

    public static String randomString(){
        return RandomStringUtils.randomAlphabetic(10);
    }
}
