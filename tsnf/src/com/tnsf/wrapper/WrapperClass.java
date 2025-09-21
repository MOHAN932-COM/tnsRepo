package com.tnsf.wrapper;

public class WrapperClass {

	public static void main(String[] args) {
		 // 1. byte -> Byte
        byte b = 10;
        Byte byteObj = b; // Auto-boxing
        byte bUnbox = byteObj; // Auto-unboxing
        System.out.println("Byte Wrapper: " + byteObj + ", Primitive: " + bUnbox);

        // 2. short -> Short
        short s = 100;
        Short shortObj = s;
        short sUnbox = shortObj;
        System.out.println("Short Wrapper: " + shortObj + ", Primitive: " + sUnbox);

        // 3. int -> Integer
        int i = 1000;
        Integer intObj = i;
        int iUnbox = intObj;
        System.out.println("Integer Wrapper: " + intObj + ", Primitive: " + iUnbox);

        // 4. long -> Long
        long l = 10000L;
        Long longObj = l;
        long lUnbox = longObj;
        System.out.println("Long Wrapper: " + longObj + ", Primitive: " + lUnbox);

        // 5. float -> Float
        float f = 12.34f;
        Float floatObj = f;
        float fUnbox = floatObj;
        System.out.println("Float Wrapper: " + floatObj + ", Primitive: " + fUnbox);

        // 6. double -> Double
        double d = 123.456;
        Double doubleObj = d;
        double dUnbox = doubleObj;
        System.out.println("Double Wrapper: " + doubleObj + ", Primitive: " + dUnbox);

        // 7. char -> Character
        char c = 'A';
        Character charObj = c;
        char cUnbox = charObj;
        System.out.println("Character Wrapper: " + charObj + ", Primitive: " + cUnbox);

        // 8. boolean -> Boolean
        boolean bool = true;
        Boolean boolObj = bool;
        boolean boolUnbox = boolObj;
        System.out.println("Boolean Wrapper: " + boolObj + ", Primitive: " + boolUnbox);
    }
}
