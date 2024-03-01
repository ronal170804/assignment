package assignment;

import java.util.Scanner;

public class Calculator {
    private double principal;
    private double rate;
    private double time;
    private double compoundFrequency;
    private double[] numbers;
    private double totalMarks;
    private double marksObtained;

    public Calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        this.principal = scanner.nextDouble();

        System.out.print("Enter rate of interest: ");
        this.rate = scanner.nextDouble();

        System.out.print("Enter time (in years): ");
        this.time = scanner.nextDouble();

        System.out.print("Enter total number of elements for mean calculation: ");
        int size = scanner.nextInt();
        this.numbers = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            this.numbers[i] = scanner.nextDouble();
        }

        System.out.print("Enter total marks: ");
        this.totalMarks = scanner.nextDouble();

        System.out.print("Enter marks obtained: ");
        this.marksObtained = scanner.nextDouble();

        scanner.close();
    }

    public double calculateSimpleInterest() {
        return (principal * rate * time) / 100;
    }

    public double calculateCompoundInterest() {
        double amount = principal * Math.pow((1 + rate), time);
        return amount - principal;
    }

    public double calculateMean() {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public long calculateFactorial() {
        long factorial = 1;
        for (int i = 1; i <= numbers.length; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public double calculatePercentage() {
        return (marksObtained / totalMarks) * 100;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println();
        
        double simpleInterest = calculator.calculateSimpleInterest();
        System.out.println("Simple Interest: " + simpleInterest);

        double compoundInterest = calculator.calculateCompoundInterest();
        System.out.println("Compound Interest: " + compoundInterest);

        double mean = calculator.calculateMean();
        System.out.println("Mean: " + mean);

        long factorial = calculator.calculateFactorial();
        System.out.println("Factorial: " + factorial);

        double percentage = calculator.calculatePercentage();
        System.out.println("Percentage: " + percentage);
    }
}
