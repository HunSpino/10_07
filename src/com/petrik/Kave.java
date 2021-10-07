package com.petrik;

public class Kave extends Forroital {
    private String tej;

    public Kave(String nev, int homerseklet, int ar, String tej) {
        super(nev, homerseklet, ar);
        this.tej = tej;
    }

    @Override
    public String toString() {
        return String.format("%s, plusz tey: %d",super.toString(),tej);
    }
}
