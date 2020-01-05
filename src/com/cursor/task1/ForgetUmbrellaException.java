package com.cursor.task1;

public class ForgetUmbrellaException extends ForgetThingsException {
    @Override
    public String getMessage() {
        return super.getMessage() + " and pick up an umbrella. This is Lviv.";
    }
}
