package com.exercise.IllegalTriangleException;

public class IllegalTriangleException extends Exception {
    private String error;

    public IllegalTriangleException(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
