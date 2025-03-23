package com.helloworld.HelloWordProject.service;

import com.helloworld.HelloWordProject.constants.EazySchoolConstants;
import com.helloworld.HelloWordProject.model.Contact;
import com.helloworld.HelloWordProject.repository.ContactRepository;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// import org.springframework.web.context.annotation.ApplicationScope;
// import org.springframework.web.context.annotation.RequestScope;
// import org.springframework.web.context.annotation.SessionScope;

@Service
@Slf4j
//@RequestScope
//@SessionScope
// @ApplicationScope
public class ContactService {

    private int counter = 0;

    @Autowired
    private ContactRepository contactRepository;

    public ContactService() {
        log.info("Contact service bean created");
    }


//    Logger logger = LoggerFactory.getLogger(ContactService.class); not required because of @Slf4j annotation

    public boolean saveMessageDetails(Contact contact) {

        boolean isSaved = false;
        contact.setStatus(EazySchoolConstants.Constant.OPEN.toString());
        contact.setCreatedBy(EazySchoolConstants.Constant.ANONYMOUS.toString());
        contact.setCreatedAt(LocalDateTime.now());

        Contact savedContact = contactRepository.save(contact);
        if(null != savedContact && savedContact.getContactId() > 0) {
            isSaved = true;
        }
        return isSaved;
    }

    public List<Contact> findMsgsWithOpenStatus() {
        List<Contact> contactMsgs = contactRepository.findByStatus(EazySchoolConstants.Constant.OPEN.toString());
        return contactMsgs;
    }

    public boolean updateMsgStatus(int contactId, String status) {
        boolean isUpdated = false;
        Optional<Contact> contact = contactRepository.findById(contactId);
        contact.ifPresent(contact1 -> {
            contact1.setStatus(status);
        });
        Contact updatedContact = contactRepository.save(contact.get());
        if(null != updatedContact && updatedContact.getUpdatedAt() != null) {
            isUpdated = true;
        }
        return isUpdated;
    }


    public int getCounter() {
        return this.counter;
    }

    public void setCounter(int n){
        this.counter = n;
    }
}
