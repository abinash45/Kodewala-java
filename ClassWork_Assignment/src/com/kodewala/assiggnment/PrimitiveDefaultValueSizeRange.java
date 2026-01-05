package com.kodewala.assiggnment;

public class PrimitiveDefaultValueSizeRange {
      byte a;
      short b;
      int c;
      long d;
      float e;
      double f;
      char g;
      boolean h;
	public static void main(String[] args) {
		
		PrimitiveDefaultValueSizeRange value = new PrimitiveDefaultValueSizeRange ();
		System.out.println("Default value, size , range of primitive datatype");
		System.out.println("---------------------------------------------------");
		
		
		System.out.println("BYTE:");
        System.out.println("Default Value : " + value.a);
        System.out.println("Size         : " + Byte.SIZE + " bits");
        System.out.println("Range        : " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + "\n");

        System.out.println("SHORT:");
        System.out.println("Default Value : " + value.b);
        System.out.println("Size         : " + Short.SIZE + " bits");
        System.out.println("Range        : " + Short.MIN_VALUE + " to " + Short.MAX_VALUE + "\n");

        System.out.println("INT:");
        System.out.println("Default Value : " + value.c);
        System.out.println("Size         : " + Integer.SIZE + " bits");
        System.out.println("Range        : " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + "\n");

        System.out.println("LONG:");
        System.out.println("Default Value : " + value.d);
        System.out.println("Size         : " + Long.SIZE + " bits");
        System.out.println("Range        : " + Long.MIN_VALUE + " to " + Long.MAX_VALUE + "\n");

        System.out.println("FLOAT:");
        System.out.println("Default Value : " + value.e);
        System.out.println("Size         : " + Float.SIZE + " bits");
        System.out.println("Range        : " + Float.MIN_VALUE + " to " + Float.MAX_VALUE + "\n");

        System.out.println("DOUBLE:");
        System.out.println("Default Value : " + value.f);
        System.out.println("Size         : " + Double.SIZE + " bits");
        System.out.println("Range        : " + Double.MIN_VALUE + " to " + Double.MAX_VALUE + "\n");

        System.out.println("CHAR:");
        System.out.println("Default Value : '" + value.g + "' (Unicode \\u0000)");
        System.out.println("Size         : " + Character.SIZE + " bits");
        System.out.println("Range        : " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE + "\n");

        System.out.println("BOOLEAN:");
        System.out.println("Default Value : " + value.h);
        System.out.println("Size         : JVM dependent (usually 1 bit)");
        System.out.println("Range        : true / false");
    }
}