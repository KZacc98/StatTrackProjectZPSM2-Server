package com.example.statstrac.rest;

import com.example.statstrac.model.Contact;
import com.example.statstrac.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/contact")
public class ContactController {

//    ArrayList<Contact>contacts=new ArrayList<>();//irl tu wpadają rzeczy z serwera
//        contacts.add(new Contact("Maddy Perez","madper@wp.pl","https://static.wikia.nocookie.net/euphoria-hbo/images/1/13/Maddy_Perez.jpg/revision/latest?cb=20200821140939.jpg"));
//        contacts.add(new Contact("Jules Vaughm","juulz@wp.pl","https://static.wikia.nocookie.net/euphoria-hbo/images/0/06/Jules_Vaughn.jpg/revision/latest/scale-to-width-down/1200?cb=20190617063942.jpg"));
//        contacts.add(new Contact("cassie Howard","cascas@wp.pl","https://static.wikia.nocookie.net/euphoria-hbo/images/f/f9/Euphoria_S2_Cassie.jpg/revision/latest?cb=20220104035238.jpg"));
//        contacts.add(new Contact("Elliot","ellie@wp.pl","https://static.wikia.nocookie.net/euphoria-hbo/images/7/7d/Euphoria_S2_Elliot.jpg/revision/latest?cb=20211225055956.jpg"));

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

