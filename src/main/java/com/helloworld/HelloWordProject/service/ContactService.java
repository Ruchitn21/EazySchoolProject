package com.helloworld.HelloWordProject.service;

import com.helloworld.HelloWordProject.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ContactService {

//    Logger logger = LoggerFactory.getLogger(ContactService.class); not required because of @Slf4j annotation

    public boolean saveMessageDetails(Contact contact) {

        boolean isSaved = true;

        //TODO - need to persist data in the DB
        log.info(contact.toString());
        return isSaved;
    }
}
