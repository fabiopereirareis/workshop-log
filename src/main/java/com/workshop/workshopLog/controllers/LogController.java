package com.workshop.workshopLog.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    Logger logger = LoggerFactory.getLogger(LogController.class);

    @RequestMapping("/")
    public String index(){
        logger.trace("Log do tipo TRACE");
        logger.debug("Log do tipo DEBUG");
        logger.info("Log do tipo INFO");
        logger.warn("Log do tipo WARN");
        logger.error("Log do tipo ERROR");

        return "Aqui estão listados os tipos de log :)";
    }

    @RequestMapping("/log")
    public String log(){
        logger.trace("Log do tipo TRACE");
        logger.debug("Log do tipo DEBUG");
        logger.info("Log do tipo INFO");
        logger.warn("Log do tipo WARN");
        logger.error("Log do tipo ERROR");

        return "Aqui estão listados os tipos de log :)";
    }
}
