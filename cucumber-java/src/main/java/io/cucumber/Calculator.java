package io.cucumber;

public class Calculator {
    private int addResult;

    public int getAddResult() {
        return addResult;
    }

    public void add(int arg1, int arg2) {
        addResult = arg1 + arg2;
    }

}