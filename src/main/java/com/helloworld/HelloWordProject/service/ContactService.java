package com.helloworld.HelloWordProject.service;

import com.helloworld.HelloWordProject.model.Contact;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    Logger logger = LoggerFactory.getLogger(ContactService.class);

    public boolean saveMessageDetails(Contact contact) {

        boolean isSaved = true;

        //TODO - need to persist data in the DB
        logger.info(contact.toString());
        return isSaved;
    }
}
