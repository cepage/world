package com.sysco.world.controller;

import com.sysco.world.config.MessageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldController {

    @Autowired
    private MessageProperties _messageProperties;

    @RequestMapping( "/message" )
    public String text() {
        return _messageProperties.getText();
    }
}
