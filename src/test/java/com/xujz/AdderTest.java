package com.xujz;

import org.junit.Assert;
import org.junit.Test;

public class AdderTest {

    @Test
    public void test_add() {
        Adder adder = new Adder();
        int c = adder.add(1, 2);
        Assert.assertEquals(3, c);
    }
}