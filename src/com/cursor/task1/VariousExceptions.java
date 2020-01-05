package com.cursor.task1;

import java.io.FileWriter;
import java.io.IOException;

public class VariousExceptions {
    public void showExceptions() {
        showForgetThingsException();
        showForgetUmbrellaException();
        showNullPointerException();
        showIOException();
    }

    private void showForgetThingsException() {
        try {
            throw new ForgetThingsException();
        } catch (ForgetThingsException exception) {
            exception.printStackTrace();
        }
    }

    private void showForgetUmbrellaException() {
        try {
            throw new ForgetUmbrellaException();
        } catch (ForgetUmbrellaException exception) {
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

