package com.example.kafkayml.model;


import lombok.Data;

import java.io.Serializable;

@Data
public class User
{

    private int id;
    private String firstName;
    private String lastName;

    @Override
    public String toString()
    {
        return "User{id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
    }
// Getters and Setters
    // toString() method
}

