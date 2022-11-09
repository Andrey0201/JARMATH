package com.javapro.lesson23.mylibrary;

/**
 * @author Andrii Andriutsa on 08.11.2022
 */
public class MathTask {

  /**
   * Display the first value terms of the Fibonacci sequence
   * Each number in the Fibonacci sequence is the sum of the two numbers that precede it.
   * */
    public void fibonacci(int value) {
      System.out.println("The first "+ value +" terms of the Fibonacci sequence");
      int n0 =0;
      int n1=1;
      int n2;
      System.out.print(n0 + " " + n1 + " ");
      for (int i = 3; i <= value; i++) {
        n2 = n0 + n1;
        System.out.print(n2 + " ");
        n0 = n1;
        n1 = n2;
      }
      System.out.println();
    }
  }

