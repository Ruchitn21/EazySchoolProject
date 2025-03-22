package com.helloworld.HelloWordProject.controller;

import com.helloworld.HelloWordProject.model.Contact;
import com.helloworld.HelloWordProject.service.ContactService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Slf4j
@Controller
public class ContactController {

    private ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @RequestMapping("/contact")
    public String getContactPage(Model model) {
        model.addAttribute("contact", new Contact());
        return "contact";
    }

//    @RequestMapping(value = "/saveMsg", method = POST)
//    public ModelAndView saveMessage(@RequestParam String name, @RequestParam String mobileNum,
//                                    @RequestParam String email, @RequestParam String subject,
//                                    @RequestParam String message) {
//        logger.info("Name : {}",name);
//        logger.info("Mobile Number : {}", mobileNum);
//        logger.info("Email : {}", email);
//        logger.info("Subject : {}", subject);
//        logger.info("Message : {}", message);
//
//        return new ModelAndView("redirect:/contact");
//
//    }

    @RequestMapping(value = "/saveMsg", method = POST)
    public String saveMessage(@Valid @ModelAttribute("contact") Contact contact, Errors errors) {

        if(errors.hasErrors()) {
            log.error("Contact form validation failed due to : {}", errors.toString());
            return "contact.html";
        }

        contactService.saveMessageDetails(contact);
        contactService.setCounter(contactService.getCounter()+1);
        log.info("Number of times contact form submitted : {}", contactService.getCounter());
        return "redirect:/contact";

    }
}
