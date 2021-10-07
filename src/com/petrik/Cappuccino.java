package com.petrik;

public class Cappuccino extends Kave{
    private int tejszinhab;

    public Cappuccino(String nev, int homerseklet, int ar, String tej, int tejszinhab) {
        super(nev, homerseklet, ar, tej);
        this.tejszinhab = tejszinhab;
    }

    @Override
    public String toString() {
        return String.format("%s, tejszínhab: ",super.toString(),this.tejszinhab);
    }
}
