package com.workshop.workshopLog.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NegocioController {

    Logger logger = LoggerFactory.getLogger(NegocioController.class);

    @RequestMapping("/negocios")
    public String log(){
        logger.info("Log do tipo INFO");
        return "Log da classe de negocios :)";
    }
}
