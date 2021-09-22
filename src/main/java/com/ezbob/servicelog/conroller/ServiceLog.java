package com.ezbob.servicelog.conroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceLog {
    private static final Logger log = LoggerFactory.getLogger(ServiceLog.class);

    @PostMapping("/service-log")
    public void serviceLog(@RequestBody String logValue){
        log.info("---EziBob log: " + logValue);
    }

    @PostMapping("/service-error-log")
    public void serviceErrLog(@RequestBody String logValue){
        log.error("---EziBob log: " + logValue);
    }
}
