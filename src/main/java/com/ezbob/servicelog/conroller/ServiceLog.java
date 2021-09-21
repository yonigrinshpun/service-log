package com.ezbob.servicelog.conroller;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log
public class ServiceLog {
    @PostMapping("/service-log")
    public String serviceLog(@RequestBody String logValue){
        log.info("---Yoni log: " + logValue);
        return "OK";
    }
}
