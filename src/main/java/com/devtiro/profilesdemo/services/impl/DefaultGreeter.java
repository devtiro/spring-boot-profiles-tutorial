package com.devtiro.profilesdemo.services.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.devtiro.profilesdemo.services.Greeter;

@Service
@Profile("!formal & !informal")
public class DefaultGreeter implements Greeter {

    @Override
    public String greet() {
        return "Hello.";
    }

}
