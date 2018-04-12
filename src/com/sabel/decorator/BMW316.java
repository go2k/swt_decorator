package com.sabel.decorator;

public class BMW316 implements Auto {

    @Override
    public double getPreis() {
        return 30000.00;
    }

    @Override
    public void druckeInfo() {
        System.out.print("BMW 316");
    }
}
