package com.xworkz.exception;

public class Exception {
  
  public static void main(String[] args) {
    System.out.println("main started");
    
    String str = null;
    String str1 = "null";
    System.out.println(str == (str1));//==check the values
    System.out.println(str == (str1));//==checks the refernce
    
    try {
      System.out.println(str.equals(str1));
    } catch (NullPointerException NE) {
      System.out.println("NE is there but rest of the coded runs");
      
    }
    
    try {
      int i = 200 / 0;
    } catch (ArithmeticException AE) {
      System.out.println("AE available but rest of the code runs");
      
    }
    
    
    String[] valve = new String[5];
    try {
      for (int i = 0; i <= valve.length; i++) {
        System.out.println(valve[i]);
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("array bound exception");
    }
    
  }
}
