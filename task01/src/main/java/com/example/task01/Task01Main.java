package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        codeWithNPE();
    }

    static int codeWithNPE() {
        String str = null;
        return str.length();
    }
}
