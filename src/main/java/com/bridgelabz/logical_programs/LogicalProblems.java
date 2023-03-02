package com.bridgelabz.logical_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class LogicalProblems {
    Scanner input = new Scanner(System.in);
    int i = 0;
    int totalNoOfNotes = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LogicalProblems logicalProblems = new LogicalProblems();
        logicalProblems.getFibonacciSeries();
        logicalProblems.getPerfectNumber();
        logicalProblems.checkPrimeNumber();
        logicalProblems.getReverseNumber();
        logicalProblems.getElapsedTime();
        logicalProblems.getCouponNumbers();
        int money = input.nextInt();
        int totalNoOfNotes = logicalProblems.getNoOfNotes(money);
        System.out.println("Total no of notes is equal to " + totalNoOfNotes);
    }

    //To get how many random nos required to get entered distinct coupon nos between range 0 to 10
    void getCouponNumbers() {
        int counter = 0;
        ArrayList<Integer> distinctCouponNos = new ArrayList<Integer>();
        distinctCouponNos.add(2);
        distinctCouponNos.add(4);
        distinctCouponNos.add(5);
        while (distinctCouponNos.size() > 0) {

            int randomNo = (int) Math.floor(Math.random() * 10);
            counter++;
            for (int i = 0; i < distinctCouponNos.size(); i++) {
                if (randomNo == distinctCouponNos.get(i)) {
                    distinctCouponNos.remove(i);
                }
            }
        }
        System.out.println("Count to get all distinct coupon nos: " + counter);
    }

    int getNoOfNotes(int money) {
        int[] array = {1000, 500, 100, 50, 10, 5, 2, 1};
        if (money == 0) {
            return -1;
        }
        if (money >= array[i]) {
            int noOfNotes = money / array[i];
            money = money % array[i];
            totalNoOfNotes += noOfNotes;
            System.out.println(array[i] + " rupees notes is equal to " + noOfNotes);
        }
        i++;
        getNoOfNotes(money);
        return totalNoOfNotes;
    }

    void getElapsedTime() {
        long start = System.nanoTime();
        System.out.println("Welcome to Stopwatch");
        System.out.println("Please enter e to stop StopWatch");
        long end = 0;
        if (input.hasNext()) {
            end = System.nanoTime();
        }

        long elapsedTime = end - start;
        double elapsedTimeSecond = (double) elapsedTime / 1000000000;
        System.out.println("Elapsed Time is equal to: " + elapsedTimeSecond + " second");
    }

    void getReverseNumber() {
        System.out.println("Welcome to get Reverse Number");
        System.out.println("Enter the number:");
        int number = input.nextInt();
        int reverseNumber = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            number = number / 10;
        }

        System.out.println("Reverse number is: " + reverseNumber);
    }

    void checkPrimeNumber() {
        System.out.println("Welcome to check Prime Number");
        System.out.println("Enter the number :");
        int number = input.nextInt();
        if (number == 2)
            System.out.println(number + " number is a prime number");
        for (int i = 2; i <= number / 2; i += 2) {
            if (number % i == 0) {
                System.out.println(number + " number is not a prime number");
                break;
            }
            System.out.println(number + " number is a prime number");
        }
    }

    void getPerfectNumber() {
        System.out.println("Welcome to get perfect number");
        System.out.println("Enter number of your choice");
        int number = input.nextInt();
        int total = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }

        if (total == number)
            System.out.println(number + " is a perfect number");
        else
            System.out.println(number + " is not a perfect number");
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
