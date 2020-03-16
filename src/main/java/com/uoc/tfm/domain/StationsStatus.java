package com.uoc.tfm.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class StationsStatus implements Serializable {

    private List<StationStatus> stationStatusList;
    private final LocalDateTime timestamp;


    public StationsStatus(LocalDateTime timestamp) {
        this.timestamp = timestamp;
        stationStatusList = new ArrayList<>();
    }

    public List<StationStatus> getStationStatusList() {
        return stationStatusList;
    }

    public void setStationStatusList(List<StationStatus> stationStatusList) {
        this.stationStatusList = stationStatusList;
    }

    public void addStation(StationStatus stationStatus){
        stationStatusList.add(stationStatus);
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
