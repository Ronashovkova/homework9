package com.cursor;

import com.cursor.task1.VariousExceptions;
import com.cursor.task2.SaveDivision;
import com.cursor.task3.RethrowingException;

public class Executor {
    public static void start() {
        SaveDivision saveDivision = new SaveDivision();
        saveDivision.divide();

        VariousExceptions variousExceptions = new VariousExceptions();
        variousExceptions.showExceptions();

        RethrowingException rethrowingException = new RethrowingException();
        rethrowingException.checkException();
    }
}
