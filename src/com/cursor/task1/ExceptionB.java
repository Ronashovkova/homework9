package com.cursor.task1;

public class ExceptionB extends ExceptionA {
    @Override
    public String getMessage() {
        return super.getMessage() + " and pick up an umbrella. This is Lviv.";
    }
}
