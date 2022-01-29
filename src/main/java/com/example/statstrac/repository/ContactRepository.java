package com.example.statstrac.repository;

import com.example.statstrac.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

    //@Query("SELECT contact FROM Contacts WHERE contact.email=?1")
    Optional<Contact> findContactByEmail(String email);

}
