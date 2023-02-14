package org.freelance.javatest;


public class StringUtilTest {

    public static void main(String[] args) {
        assertEquals(StringUtil.repeat("Hola", 3), "HolaHolaHola");
        assertEquals(StringUtil.repeat("Hola", 3), "HolaHolaHola");

    }

    private static void assertEquals(String result, String expected) {
        if (!result.equals("HolaHolaHola")) {
            throw new RuntimeException(result + " is not equal to " + expected);
        }
    }


}