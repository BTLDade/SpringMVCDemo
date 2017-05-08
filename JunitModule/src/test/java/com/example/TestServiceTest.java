package com.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ak on 2017/5/4.
 */
public class TestServiceTest {

    private TestService test = new TestService();

    @Test
    public void add() throws Exception {
        Integer res = test.add(1,2);
        Assert.assertEquals((Integer) 3, res);
    }

}