package com.cursor.task3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class RethrowingException {

    private void findFile() throws IOException {
        File newFile = new File("test.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }

    public void checkException() {
        try {
            findFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}