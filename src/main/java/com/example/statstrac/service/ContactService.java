package com.example.statstrac.service;


import com.example.statstrac.model.Contact;
import com.example.statstrac.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ContactService {

    private final ContactRepository contactRepository;

    @Autowired
    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }


    public List<Contact> getContacts() {

        return contactRepository.findAll();

    }

    public void addNewContact(Contact contact) {
        Optional<Contact> contactOptional = contactRepository.findContactByEmail(contact.getEmail());
        if (contactOptional.isPresent()) {
            throw new IllegalStateException("Email taken");
        }
        contactRepository.save(contact);
    }

    public void deleteContact(Long contactId) {
        boolean exists = contactRepository.existsById(contactId);
        if (!exists) {
            throw new IllegalStateException("Contact with id: " + contactId + " does not exist");
        }
        contactRepository.deleteById(contactId);
    }

    @Transactional
    public void updateContact(Long contactId, String name, String email) {
        Contact contact = contactRepository.findById(contactId).orElseThrow(() -> new IllegalStateException(
                "Contact with id: " + contactId + " does not exist"));

        if (name != null && name.length() > 0 && !Objects.equals(contact.getName(), name)) {
            contact.setName(name);
        }

        if (email != null && email.length() > 0 && !Objects.equals(contact.getEmail(), email)) {
            Optional<Contact> contactOptional = contactRepository.findContactByEmail(email);
            if (contactOptional.isPresent()) {
                throw new IllegalStateException("Email taken");
            }
            contact.setEmail(email);
        }

    }
}
