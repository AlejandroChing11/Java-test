package org.freelance.javatest;


public class StringUtilTest {

    public static void main(String[] args) {
        String result = StringUtil.repeat("Hola", 3);

        if (!result.equals("HolaHolaHola")) {
            System.out.println("ERROR");
        }

        String result2 = StringUtil.repeat("Hola", 3);

        if (!result2.equals("HolaHolaHola")) {
            System.out.println("ERROR");
        }
    }

}