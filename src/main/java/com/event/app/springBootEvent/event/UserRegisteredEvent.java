package com.event.app.springBootEvent.event;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class UserRegisteredEvent {

    private String username;
    private String password;
    private byte age;

}
