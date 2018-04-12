package com.sabel.decorator;

public abstract class Sonderausstattung implements Auto{

    protected Auto auto;

    public Sonderausstattung(Auto auto) {
        this.auto = auto;
    }

}


