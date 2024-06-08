package com.event.app.springBootEvent.listener;


import com.event.app.springBootEvent.event.UserRegisteredEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserListener {

    @EventListener
    public void listenerUserRegisteredEvent(UserRegisteredEvent userRegisteredEvent){
        System.out.println("LISTENING: Event has been listened ) ".concat(userRegisteredEvent.toString()));
    }

}

