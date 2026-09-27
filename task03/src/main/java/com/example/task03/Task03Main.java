package com.example.task03;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class Task03Main {
    public static void main(String[] args) throws Exception{
        throwCheckedException();
    }

    public static void throwCheckedException() throws Exception{
        throw new Exception("Это проверяемое исключение");
    }
}