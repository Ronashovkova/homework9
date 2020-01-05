package com.cursor.task1;

public class ForgetThingsException extends Exception {
    @Override
    public String getMessage() {
        return "Don't go away without your phone";
    }
}
