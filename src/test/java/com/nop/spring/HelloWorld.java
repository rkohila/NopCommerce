package com.nop.spring;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: Jey
 * Date: 11/06/17
 * Time: 21:19
 * To change this template use File | Settings | File Templates.
 */
@Component
public class HelloWorld {

    private String message;

    public void setMessage(String message){
        this.message  = message;
    }
    public String getMessage(){
        System.out.println("Your Message : " + message);
        return message;
    }
}
