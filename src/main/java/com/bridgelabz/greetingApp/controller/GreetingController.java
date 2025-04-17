package com.bridgelabz.greetingApp.controller;

import com.bridgelabz.greetingApp.model.Greeting;
import com.bridgelabz.greetingApp.model.UserInfo;
import com.bridgelabz.greetingApp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greetings")
public class GreetingController {
    @Autowired
    private IGreetingService greetingService;

    //Using GreetingController return JSON for different HTTP Methods.
    //GET http://localhost:8081/greetings?Yagyata
    @GetMapping("")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        UserInfo user = new UserInfo();
        user.setFirstName(name);
        return greetingService.addGreeting(user);
    }

    //Extend GreetingController to use Services Layer to get Simple Greeting message ”Hello World”
    //GET http://localhost:8081/greetings/simple
    @GetMapping("/simple")
    public Greeting getSimpleGreeting() {
        return greetingService.getSimpleGreeting();
    }

    //GET http://localhost:8081/greetings/full?firstName=Yagyata&lastName=Sharma
    @GetMapping("/full")
    public Greeting fullName(@RequestParam(value = "firstName") String firstName,
                             @RequestParam(value = "lastName") String lastName) {
        UserInfo user = new UserInfo();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return greetingService.addGreeting(user);
    }

    //GET http://localhost:8081/greetings/{id}
    @GetMapping("/{id}")
    public Greeting getGreetingsById(@PathVariable long id) {
        return greetingService.getGreetingById(id);
    }

    //GET http://localhost:8081/greetings/all
    @GetMapping("/all")
    public List<Greeting> getAllGreetings() {
        return greetingService.getAllGreetings();
    }

    //PUT http://localhost:8081/greetings/{id}?message=new message
    @PutMapping("/{id}")
    public Greeting updateGreeting(@PathVariable long id, @RequestParam String message) {
        return greetingService.updateGreeting(id, message);
    }

    //DELETE http://localhost:8081/greetings/{id}
    @DeleteMapping("/{id}")
    public String deleteGreeting(@PathVariable long id) {
        greetingService.deleteGreeting(id);
        return "Greeting with ID " + id + " has been deleted.";
    }

}
