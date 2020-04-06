package com.uoc.tfm.controller;

import com.uoc.tfm.service.ConsumerService;
import com.uoctfm.commons.domain.Stations;
import com.uoctfm.commons.domain.StationsStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConsumerControllerImpl implements ConsumerController{

    private static Logger log = LoggerFactory.getLogger(ConsumerControllerImpl.class);

    @Autowired
    private ConsumerService consumerService;

    @Override
    @GetMapping("/station")
    public Stations getStations() {
        log.info("Starting station collections: {}", consumerService.getServiceName());
        Stations stations = consumerService.getStations();
        log.info("Ending station collections: {} with {} registers",
                consumerService.getServiceName(),
                stations.getStationList().size());
        return stations;

    }

    @Override
    @GetMapping("/status")
    public StationsStatus getStationStatus() {
        log.info("Starting station status collections: {}", consumerService.getServiceName());
        StationsStatus stationStatus = consumerService.getStationStatus();
        log.info("Ending station status collections: {} with {} registers",
                consumerService.getServiceName(),
                stationStatus.getStationStatusList().size());
        return stationStatus;

    }
}
