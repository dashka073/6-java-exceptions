package com.example.task06;

import jdk.jfr.StackTrace;

public class Task06Main {
    public static void main(String[] args) {
        new Task06Main().printMethodName();
    }

    void printMethodName() {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        // stack[0] — getStackTrace()
        // stack[1] — printMethodName()
        // stack[2] — тот, кто вызвал printMethodName()
        System.out.print(stack[2].getMethodName());
    }

}