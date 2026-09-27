package com.example.task04;

public class Task04Main {

    public static void main(String[] args) {
        System.out.println(getSeason(-5));
    }

    static String getSeason(int monthNumber) {
        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) return "зима";
        if (monthNumber > 2 && monthNumber < 6) return "весна";
        if (monthNumber > 5 && monthNumber < 9) return "лето";
        if (monthNumber > 8 && monthNumber < 12) return "осень";
        throw new MyException("monthNumber " + monthNumber + " is invalid, month number should be between 1..12");
    }
}