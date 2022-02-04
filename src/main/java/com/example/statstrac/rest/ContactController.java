package com.example.statstrac.rest;

import com.example.statstrac.model.Contact;
import com.example.statstrac.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/contact")
public class ContactController {

    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping
    public List<Contact> getContacts(){
        return contactService.getContacts();
    }

    @PostMapping
    public void registerNewContact(@RequestBody Contact contact){
        contactService.addNewContact(contact);
    }
    @DeleteMapping(path="{contactId}")
    public void deleteContact(@PathVariable("contactId") Long contactId){
        contactService.deleteContact(contactId);
    }
    @PutMapping(path = "{contactId}")
    public void updateContact(@PathVariable("contactId") Long contactId,
                              @RequestParam(required = false) String name,
                              @RequestParam(required = false) String email){
        contactService.updateContact(contactId,name,email);
    }


}

