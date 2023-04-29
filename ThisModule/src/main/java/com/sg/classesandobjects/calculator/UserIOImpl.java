package com.sg.classesandobjects.calculator;
import java.util.Scanner;
public class UserIOImpl implements UserIO {
    Scanner myScanner = new Scanner(System.in);

    @Override
    public void print(String message){
        System.out.println(message);
    }

    @Override
    public String readString(String prompt){
        System.out.println(prompt);
        String userInput = myScanner.nextLine();
        return userInput;
    }

    @Override
    public int readInt(String prompt){
        System.out.println(prompt);
        int userInput = Integer.parseInt(myScanner.nextLine());
        return userInput;
    }

    @Override
    public int readInt(String prompt, int min, int max){
        System.out.println(prompt + min + " and " + max);
        int userInput = Integer.parseInt(myScanner.nextLine());
        return userInput;
    }

    @Override
    public double readDouble(String prompt){
        System.out.println(prompt);
        double userInput = Double.parseDouble(myScanner.nextLine());
        return userInput;
    }

    @Override
    public double readDouble(String prompt, double min, double max){
        System.out.println(prompt + min + " and " + max);
        double userInput = Double.parseDouble(myScanner.nextLine());
        return userInput;
    }

    @Override
    public float readFloat(String prompt) {
        System.out.println(prompt);
        float userInput = Float.parseFloat(myScanner.nextLine());
        return userInput;
    }

    @Override
    public float readFloat(String prompt, float min, float max){
        System.out.println(prompt + min + " and " + max);
        float userInput = Float.parseFloat(myScanner.nextLine());
        return userInput;
    }

    @Override
    public long readLong(String prompt){
        System.out.println(prompt);
        long userInput = Long.parseLong(myScanner.nextLine());
        return userInput;
    }

    @Override
    public long readLong(String prompt, long min, long max){
        System.out.println(prompt + min + " and " + max);
        long userInput = Long.parseLong(myScanner.nextLine());
        return userInput;
    }
}
