package com.damianJakubowski;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberTest {

    private Number number;

    @Before
    public void setup(){
        number = new Number();
    }
    @Test
    public void testsumm(){
        int result = number.sum();

        assertEquals(13,result);
    }

}
