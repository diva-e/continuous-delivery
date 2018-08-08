package com.divae.mbeck.sa.continuous.delivery.controller;

import com.divae.mbeck.sa.continuous.delivery.model.CDModel;
import com.divae.mbeck.sa.continuous.delivery.service.CDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CDController {

    @Autowired
    private CDService service;

    @GetMapping("/model")
    @ResponseBody
    public CDModel getModel() {
        return service.getModel();
    }

}
