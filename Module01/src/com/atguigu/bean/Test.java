package com.atguigu.bean;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        String s="";
        for (char i = 'a'; i <'d' ; i++) {
            System.out.println(i);
            //s=s+i;
            s=i+s;
        }
        ArrayList list = new ArrayList();
        System.out.println(s);
    }
}
