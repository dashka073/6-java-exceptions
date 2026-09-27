package com.example.task07;

public class Task07Main {

    public static final String CHECKED = "checked";
    public static final String UNCHECKED = "unchecked";
    public static final String NONE = "none";

    public static void main(String[] args) {
        Task07Main t = new Task07Main();

        t.processor = new Processor();
        System.out.println(t.getExceptionType());

        t.processor = new Processor() {
            @Override
            public Object process() {
                throw new IllegalStateException("oops");
            }
        };
        System.out.println(t.getExceptionType());

        t.processor = new Processor() {
            @Override
            public Object process() throws Exception {
                throw new java.io.IOException("io error");
            }
        };
        System.out.println(t.getExceptionType());
    }

    public Processor processor;

    public String getExceptionType() {
        try {
            processor.process();
        } catch (RuntimeException e) {
            return UNCHECKED;
        } catch (Exception e) {
            return CHECKED;
        }
        return NONE;
    }

}