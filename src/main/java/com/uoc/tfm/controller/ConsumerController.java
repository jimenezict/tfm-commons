package com.uoc.tfm.controller;

import com.uoctfm.commons.domain.Stations;
import com.uoctfm.commons.domain.StationsStatus;

public interface ConsumerController {

    public Stations getStations();

    public StationsStatus getStationStatus();

}
