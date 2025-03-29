package com.helloworld.HelloWordProject.service;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.helloworld.HelloWordProject.constants.EazySchoolConstants;
import com.helloworld.HelloWordProject.model.Person;
import com.helloworld.HelloWordProject.model.Roles;
import com.helloworld.HelloWordProject.repository.PersonRepository;
import com.helloworld.HelloWordProject.repository.RolesRepository;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private RolesRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public boolean createNewPerson(Person person) {
        boolean isSaved = false;
        Roles role = roleRepository.findByRoleName(EazySchoolConstants.Constant.STUDENT.toString());
        person.setRoles(role);
        person.setPwd(passwordEncoder.encode(person.getPwd()));
        person = personRepository.save(person);
        if(person != null && person.getPersonId() > 0) {
            isSaved = true;
        }
        return isSaved;
    }
}
