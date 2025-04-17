package com.bridgelabz.greetingApp.service;

import com.bridgelabz.greetingApp.model.Greeting;
import com.bridgelabz.greetingApp.model.UserInfo;

import java.util.List;

//The two classes made inside service package to create a contract b/w two classes
public interface IGreetingService {
    Greeting addGreeting(UserInfo user);
    Greeting getGreetingById(long id);
    Greeting getSimpleGreeting();
    List<Greeting> getAllGreetings();
    Greeting updateGreeting(long id, String newMessage);
    void deleteGreeting(long id);
}
