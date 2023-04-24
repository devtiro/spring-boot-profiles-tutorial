package com.devtiro.profilesdemo.services.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.devtiro.profilesdemo.services.Greeter;

@Service
@Profile("formal")
public class FormalGreeter implements Greeter {

    @Override
    public String greet() {
        return "How do you do?";
    }

}
