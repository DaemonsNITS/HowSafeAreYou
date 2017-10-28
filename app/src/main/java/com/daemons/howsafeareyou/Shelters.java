package com.daemons.howsafeareyou;

/**
 * Created by mrinmay on 29/10/17.
 */

public class Shelters {
    private double latitude;
    private double longitude;

    public Shelters() {
    }

    public Shelters(double latitude, double longitude) {
        this.setLatitude(latitude);
        this.setLongitude(longitude);
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
