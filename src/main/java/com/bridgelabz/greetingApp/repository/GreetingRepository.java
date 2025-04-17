package com.bridgelabz.greetingApp.repository;

import com.bridgelabz.greetingApp.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting,Long> { //interface is used to provide flexibility, here, Jpa is also an interface

}
