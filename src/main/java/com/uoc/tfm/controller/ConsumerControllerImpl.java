package com.uoc.tfm.controller;

import com.uoc.tfm.service.ConsumerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class ConsumerControllerImpl implements ConsumerController{

    private static Logger log = LoggerFactory.getLogger(ConsumerControllerImpl.class);

    @Autowired
    private ConsumerService consumerService;

    @Override
    public void getStations() {
        log.info("Starting station collections: {}", consumerService.getServiceName());
        consumerService.getStations();
        log.info("Ending station collections: {}", consumerService.getServiceName());
    }

    @Override
    public void getStationStatus() {
        log.info("Starting station status collections: {}", consumerService.getServiceName());
        consumerService.getStationStatus();
        log.info("Ending station status collections: {}", consumerService.getServiceName());
    }
}
