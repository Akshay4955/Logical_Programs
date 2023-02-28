package com.bridgelabz.logical_programs;

import java.util.Scanner;

public class LogicalProblems {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        LogicalProblems logicalProblems = new LogicalProblems();
        logicalProblems.getFibonacciSeries();
    }

    public void getFibonacciSeries() {
        System.out.println("Welcome to Fibonacci Series");
        System.out.println("Enter how many numbers you required");
        int noOfFibonacci = input.nextInt();
        int fiboOne = 1, fiboTwo = 1, fibonacci = 1;
        for (int i = 1; i <= noOfFibonacci; i++) {
            if (i == 1 || i == 2) {
                System.out.print(fibonacci + " ");
            } else {
                fibonacci = fiboOne + fiboTwo;
                fiboOne = fiboTwo;
                fiboTwo = fibonacci;
                System.out.print(fibonacci + " ");
            }
        }

    }
}
