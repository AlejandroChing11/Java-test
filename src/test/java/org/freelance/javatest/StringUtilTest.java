package org.freelance.javatest;


import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void testRepeat() {
        Assert.assertEquals("HolaHolaHola", StringUtil.repeat("Hola", 3));
        Assert.assertEquals("HolaHolaHola", StringUtil.repeat("Hola", 3));
    }

}