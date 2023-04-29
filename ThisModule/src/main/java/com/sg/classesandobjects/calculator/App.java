package com.sg.classesandobjects.calculator;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("+:  Add");
        System.out.println("-:  Subtract");
        System.out.println("*:  Multiply");
        System.out.println("/:  Divide");
        System.out.println("X:  Exit");
        System.out.println("Choose from the above options:");
        String userOperator = myScanner.nextLine();
        if (userOperator.equals("X") || userOperator.equals("x")){
            System.out.println("Thank you and goodbye!");
        }
        else {
            System.out.println("Input first integer:");
            int userNum1 = myScanner.nextInt();
            System.out.println("Input second integer:");
            int userNum2 = myScanner.nextInt();
            int intResult;
            double doubleResult;
            switch (userOperator) {
                case "+":
                    intResult = SimpleCalculator.add(userNum1, userNum2);
                    System.out.println(intResult);
                    break;
                case "-":
                    intResult = SimpleCalculator.subtract(userNum1, userNum2);
                    System.out.println(intResult);
                    break;
                case "*":
                    intResult = SimpleCalculator.multiply(userNum1, userNum2);
                    System.out.println(intResult);
                    break;
                case "/":
                    doubleResult = SimpleCalculator.divide(userNum1, userNum2);
                    System.out.println(doubleResult);
                    break;
                default:
                    System.out.println("You have not put in the correct operator");

            }
        }
    }
}
