package com.uoc.tfm.domain;

public class Station {

    private final int id;
    private final int size;
    private final int occupacy;

    public Station(int id, int size, int occupacy) {
        this.id = id;
        this.size = size;
        this.occupacy = occupacy;
    }

    public int getId() {
        return id;
    }

    public int getSize() {
        return size;
    }

    public int getOccupacy() {
        return occupacy;
    }
}
