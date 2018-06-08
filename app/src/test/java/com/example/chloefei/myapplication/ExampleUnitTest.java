package com.example.chloefei.myapplication;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }



    public void test(){

        Validator s1=new Validator("password");
        Validator s2=new Validator("Qwerty!");
        Validator s3=new Validator("abc");
        Validator s4=new Validator("!!$$");
        Validator s5=new Validator("Qwerty321!");


        assertEquals(s1.pass(),1);
        assertEquals(s2.pass(),4);
        assertEquals(s3.pass(),1);
        assertEquals(s4.pass(),1);
        assertEquals(s5.pass(),5);

    }
}