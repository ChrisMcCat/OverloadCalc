package com.infoshare.jjdd8;

public class Calculator {

    public int firstNumberI = 4;


    public void add(int firstNumberI, int secondNumberI) {
        int sum = firstNumberI + secondNumberI;
        System.out.println(sum);
    }

    public void add(float firstNumberF, float secondNumberF){
        float sum2 = firstNumberF + secondNumberF;
        System.out.println(sum2);
    }

    public void add(String firstNumberS, String secondNumberS){
        String sum3 = firstNumberS + secondNumberS;
        System.out.println(sum3);
    }

    public static void main(String[] args) {
    }
}
