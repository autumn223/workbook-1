package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        // Question 1: Who has the higher salary?
        double bobSalary = 70000.00 + Math.random() * 10000; // random between 70k and 80k
        double garySalary = 70000.00 + Math.random() * 10000; // random between 70k and 80k
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("Question 1:");
        System.out.println(" - Bob's salary: $" + bobSalary);
        System.out.println(" - Gary's salary: $" + garySalary);
        System.out.println(" - The highest salary is: $" + highestSalary);

        System.out.println(); // Spacer

        // Question 2: Which vehicle is cheaper?
        double carPrice = 20000.00 + Math.random() * 10000; // random between 20k and 30k
        double truckPrice = 25000.00 + Math.random() * 15000; // random between 25k and 40k
        double lowerPrice = Math.min(carPrice, truckPrice);
        System.out.println("Question 2:");
        System.out.println(" - Car price: $" + carPrice);
        System.out.println(" - Truck price: $" + truckPrice);
        System.out.println(" - The lower price is: $" + lowerPrice);

        System.out.println(); // Spacer

        // Question 3: Area of a circle with radius 7.25
        double radius = 7.25;
        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("Question 3: The area of a circle with radius 7.25 is " + circleArea);

        System.out.println(); // Spacer

        // Question 4: Square root of a number
        double numberToSqrt = 5.0;
        double squareRoot = Math.sqrt(numberToSqrt);
        System.out.println("Question 4: The square root of " + numberToSqrt + " is " + squareRoot);

        System.out.println(); // Spacer

        // Question 5: Distance between two points (5,10) and (85,50)
        int x1 = 5, y1 = 10;
        int x2 = 85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Question 5: The distance between (5,10) and (85,50) is " + distance);

        System.out.println(); // Spacer

        // Question 6: Absolute value of a number
        double negativeValue = -3.8;
        double absoluteValue = Math.abs(negativeValue);
        System.out.println("Question 6: The absolute value of " + negativeValue + " is " + absoluteValue);

        System.out.println(); // Spacer

        // Question 7: Random number between 0 and 1
        double randomValue = Math.random(); // returns a value between 0.0 and 1.0
        System.out.println("Question 7: A random number between 0 and 1 is " + randomValue);
    }
}
