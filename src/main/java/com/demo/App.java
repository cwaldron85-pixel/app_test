package com.demo;

public class App {
    public static String greet() {
        return "Hello CI Pipeline!";
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int square(int x) {
        return x * x;
    }
    public  static String  display()
    {
        return "display data";
    }    
    public static void main(String[] args) {
        System.out.println(greet());
        System.out.println("Calculator Demo:");
        System.out.println("2 + 3 = " + add(2, 3));
        
    }
}