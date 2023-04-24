package com.devtiro.profilesdemo.services.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.devtiro.profilesdemo.services.Greeter;

@Service
@Profile("informal")
public class InformalGreeter implements Greeter {

    @Override
    public String greet() {
        return "'ello mate!";
    }

}
