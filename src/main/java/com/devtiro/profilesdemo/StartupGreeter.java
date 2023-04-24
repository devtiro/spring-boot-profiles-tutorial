package com.devtiro.profilesdemo;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.devtiro.profilesdemo.services.Greeter;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class StartupGreeter {

    private final Greeter greeter;

    public StartupGreeter(Greeter greeter) {
        this.greeter = greeter;
    }

    @EventListener(ApplicationReadyEvent.class)
	public void greet() {
		log.info(greeter.greet());
	}

}
