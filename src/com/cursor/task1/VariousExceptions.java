package com.cursor.task1;

import java.io.FileWriter;
import java.io.IOException;

public class VariousExceptions {
    public void showExceptions() {
        showExceptionA();
        showExceptionB();
        showNullPointerException();
        showIOException();
    }

    private void showExceptionA() {
        try {
            throw new ExceptionA();
        } catch (ExceptionA exception) {
            exception.printStackTrace();
        }
    }

    private void showExceptionB() {
        try {
            throw new ExceptionB();
        } catch (ExceptionB exception) {
            exception.printStackTrace();
        }
    }

    private void showNullPointerException() {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException exception) {
            exception.printStackTrace();
        }
    }

    private void showIOException() {
        try {
            FileWriter fileWriter = new FileWriter("out.txt");
            fileWriter.close();
            fileWriter.write("Hello World");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

