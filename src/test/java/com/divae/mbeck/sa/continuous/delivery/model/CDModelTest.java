package com.divae.mbeck.sa.continuous.delivery.model;

import org.junit.Assert;
import org.junit.Test;

public class CDModelTest {

    @Test
    public void isMessageSet() {
        String testMessage = "test message";

        CDModel cdModel = CDModel.builder()
                .message(testMessage)
                .build();

        Assert.assertEquals(testMessage, cdModel.getMessage());
    }

    @Test
    public void isFalse() {
         Assert.assertFalse(false);
    }

}