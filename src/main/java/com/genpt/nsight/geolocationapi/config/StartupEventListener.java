package com.genpt.nsight.geolocationapi.config;

import com.genpt.nsight.geolocationapi.service.SiteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StartupEventListener {
    private static final Logger logger = LoggerFactory.getLogger(StartupEventListener.class);

    @Autowired
    SiteService sitecacheService;

    @EventListener
    public void onApplicationReady(ApplicationReadyEvent ready){
        sitecacheService.fetchAllSites();     //THIS WORKS?!?!?!
    }

}
