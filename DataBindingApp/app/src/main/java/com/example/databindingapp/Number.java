package com.example.databindingapp;

import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.databindingapp.databinding.ActivityMainBinding;

public class Number extends BaseObservable {

    String num1;
    String num2;
    String num3;
    ActivityMainBinding mainBinding;

    public Number(ActivityMainBinding mainBinding) {
        this.mainBinding = mainBinding;
    }

    public Number() {
    }
    @Bindable
    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }
    @Bindable
    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }
    @Bindable
    public String getNum3() {
        return num3;
    }

    public void setNum3(String num3) {
        this.num3 = num3;
    }

    public void solveEquation(View view)
    {
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        int c = Integer.parseInt(num3);
        double d = b*b - 4*a*c;
        double x1,x2;
        if (d > 0)
        {
            x1 = (-b + Math.sqrt(d))/(2*a);
            x2 = (-b - Math.sqrt(d))/(2*a);
        } else if (d == 0) {
            x1 = (double) (-b) /(2*a);
            x2 = (double) (-b) /(2*a);

        }
        else
        {
            x1 = -999f;
            x2 = -999f;
        }
        mainBinding.tview.setText("X1 = " + x1+ " : X2 = " + x2);
    }
}
