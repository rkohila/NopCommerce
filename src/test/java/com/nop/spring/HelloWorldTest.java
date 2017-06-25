package com.nop.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 * User: Jey
 * Date: 11/06/17
 * Time: 21:20
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {HelloConfig.class})
public class HelloWorldTest {

    @Autowired
    private HelloWorld helloWorld;

    @Test
    public void helloTest(){
        helloWorld.setMessage("Im new to spring");
        System.out.println("helloWorld = " + helloWorld.getMessage());
        //helloWorld.getMessage();
    }
}
