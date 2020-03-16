package com.uoc.tfm.domain;

class Station {

    private int id;
    private double x_coordinate;
    private int y_coordinate;
    private String address;

    public Station(int id, double x_coordinate, int y_coordinate, String address) {
        this.id = id;
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getX_coordinate() {
        return x_coordinate;
    }

    public void setX_coordinate(double x_coordinate) {
        this.x_coordinate = x_coordinate;
    }

    public int getY_coordinate() {
        return y_coordinate;
    }

    public void setY_coordinate(int y_coordinate) {
        this.y_coordinate = y_coordinate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
