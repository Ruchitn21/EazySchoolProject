package com.helloworld.HelloWordProject.service;

import com.helloworld.HelloWordProject.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Service
@Slf4j
//@RequestScope
//@SessionScope
@ApplicationScope
public class ContactService {

    private int counter = 0;

    public ContactService() {
        log.info("Contact service bean created");
    }

//    Logger logger = LoggerFactory.getLogger(ContactService.class); not required because of @Slf4j annotation

    public boolean saveMessageDetails(Contact contact) {

        boolean isSaved = true;

        //TODO - need to persist data in the DB
        log.info(contact.toString());
        return isSaved;
    }

    public int getCounter() {
        return this.counter;
    }

    public void setCounter(int n){
        this.counter = n;
    }
}
