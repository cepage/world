package com.sysco.world.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "message")
public class MessageProperties {
    private String _text;

    public MessageProperties() {
    }

    public String getText() {
        return _text;
    }

    public void setText(String text) {
        _text = text;
    }
}
