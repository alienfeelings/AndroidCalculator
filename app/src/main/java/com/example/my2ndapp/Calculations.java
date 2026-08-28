package com.example.my2ndapp;

public class Calculations {
    private double num1;
    private double num2;
    private double result;

    public Calculations(double n1, double n2){
        this.num1 = n1;
        this.num2 = n2;
    }

    public void Addition(){
        this.result = this.num1 + this.num2;
    }

    public double getResult(){
        return this.result;
    }
}
