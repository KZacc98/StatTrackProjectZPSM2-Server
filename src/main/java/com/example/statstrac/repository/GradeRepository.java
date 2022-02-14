package com.example.statstrac.repository;

import com.example.statstrac.model.Contact;
import com.example.statstrac.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GradeRepository extends JpaRepository<Grade,Long> {

    //@Query("SELECT contact FROM Contacts WHERE contact.email=?1")
    //Optional<Grade> findGradeByGradeId(Long gradeId);



}
