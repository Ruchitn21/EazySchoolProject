package com.helloworld.HelloWordProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.helloworld.HelloWordProject.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

    Person findByEmail(String email);
    
}
