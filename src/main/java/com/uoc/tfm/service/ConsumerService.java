package com.uoc.tfm.service;

import com.uoctfm.commons.domain.Stations;
import com.uoctfm.commons.domain.StationsStatus;

public interface ConsumerService {

    public Stations getStations();

    public StationsStatus getStationStatus();

    public String getServiceName();

}
