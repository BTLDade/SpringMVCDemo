package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by ak on 2017/5/8.
 */
public class TestJava8 {

    public static void main(String[] args) {
        List<TestBean> list = new ArrayList<>();

        TestBean t = new TestBean();
        t.setName("dade");
        t.setId("12346");

        list.add(t);



        System.out.println(list.stream().findFirst().map(o -> {
            TestBean tb = new TestBean();
            tb.setName(o.getName());
            return tb;
        }).orElse(null));

        List<TestBean> olist = list.stream().collect(Collectors.toList((TestBean)tb -> Stream.of(tb.).collect(Collectors.joining("|"))));


        System.out.println(

                olist

        );

    }


}
