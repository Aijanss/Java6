package com.company;

public class Main {

    public static void main(String[] args) {
       System.out.println("Результат умножеия = " + new Multiply <Integer>().multiplyNumbers(145,400));
        System.out.println("Результат умножеия = " + new Multiply <Integer>().multiplyNumbers(40,4));
        System.out.println("Результат умножеия = " + new Multiply <Integer>().multiplyNumbers(20,35));
}
}
