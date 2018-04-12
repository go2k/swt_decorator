package com.sabel.decorator;

public class Main {

    public static void main(String[] args) {

        Auto auto = new BMW316();
        auto = new Navigation(auto);
        auto.druckeInfo();
        System.out.println(" für den Preis von: " + auto.getPreis());

        auto = new Klimaanlage(auto);
        auto.druckeInfo();
        System.out.println(" für den Preis von: " + auto.getPreis());

    }

}
