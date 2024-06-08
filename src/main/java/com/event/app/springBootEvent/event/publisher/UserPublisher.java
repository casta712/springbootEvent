package com.event.app.springBootEvent.event.publisher;

import com.event.app.springBootEvent.event.UserRegisteredEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class UserPublisher {

    private final ApplicationEventPublisher applicationEventPublisher;


    public UserPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publishUserRegisteredEvent()  {
        System.out.println("PUBLISH: Event has been published");
        applicationEventPublisher.publishEvent(new UserRegisteredEvent("alejabdro",  "31250652", (byte) 34 ));
    }




}
