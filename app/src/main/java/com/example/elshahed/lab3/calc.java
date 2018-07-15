package com.example.elshahed.lab3;



public class calc {
    calc(){}
    public double sum(double number1,double number2)
    {
        return number1+number2;
    }
    public double min(double number1,double number2)
    {
        return number1-number2;
    }
    public double by(double number1,double number2)
    {
        return number1*number2;
    }
    public double div(double number1,double number2)
    {
        if(number2==0)
        {
            return 0;
        }
        return number1/number2;
    }
}
