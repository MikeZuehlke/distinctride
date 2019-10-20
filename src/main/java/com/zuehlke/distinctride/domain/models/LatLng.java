package com.zuehlke.distinctride.domain.models;

public class LatLng {

    public int latitute;
    public int longitute;

    public LatLng(int latitute, int longitute) {
        this.latitute = latitute;
        this.longitute = longitute;
    }

    public LatLng(double latitute, double longitute) {
        this.latitute = (int) Math.round(latitute * 1e5);
        this.longitute = (int) Math.round(longitute * 1e5);
    }

    @Override
    public String toString() {
        return "(" + latitute * 1e-5 + ", " + longitute * 1e-5 + ")" ;
    }
}
