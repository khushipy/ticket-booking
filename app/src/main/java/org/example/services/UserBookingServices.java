package org.example.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entities.User;

import java.io.File;

public class UserBookingServices {
    private User user;

    private ObjectMapper ObjectMapper = new ObjectMapper();

    private static final String USERS_PATH = "";

    public UserBookingServices(User user1){
        this.user = user1;
        File users = new File(USERS_PATH);
    }
}
