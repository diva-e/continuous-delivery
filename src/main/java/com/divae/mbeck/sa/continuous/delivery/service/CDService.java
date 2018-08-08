package com.divae.mbeck.sa.continuous.delivery.service;


import com.divae.mbeck.sa.continuous.delivery.model.CDModel;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class CDService {

    private CDModel model;

    @PostConstruct
    public void setUp() {
        initModel();
        printModel();
    }

    private void printModel() {
        CDModel model = getModel();
        System.out.println("CDService - model: " + model);
    }

    private void initModel() {
        model = CDModel.builder()
                .message("init by CDService ...")
                .build();
    }

    public CDModel getModel() {
        return model;
    }
}
