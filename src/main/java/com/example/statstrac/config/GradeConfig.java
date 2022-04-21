package com.example.statstrac.config;

import com.example.statstrac.model.Grade;
import com.example.statstrac.model.Subject;
import com.example.statstrac.repository.GradeRepository;
import com.example.statstrac.repository.SubjectRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class GradeConfig {
    @Bean
    CommandLineRunner commandLineRunner3(GradeRepository repository) {
        return args -> {
            Grade grade1 = new Grade(3.5, "Sprawdzian", 1L);
            Grade grade2 = new Grade(4.0, "Kartkówka", 1L);
            Grade grade3 = new Grade(4.5, "Odpowiedź ustna", 1L);
            Grade grade4 = new Grade(3.0, "Referat", 1L);

            Grade grade5 = new Grade(3.0, "Sprawdzian", 2L);
            Grade grade6 = new Grade(4.5, "Kartkówka", 2L);

            Grade grade7 = new Grade(2.0, "Odpowiedź ustna", 3L);
            Grade grade8 = new Grade(3.5, "Kartkówka", 3L);

            Grade grade9 = new Grade(3.5, "Sprawdzian", 4L);
            Grade grade10 = new Grade(4.5, "Zadanie domowe", 4L);


            repository.saveAll(
                    List.of(grade1, grade2, grade3, grade4, grade5, grade6, grade7, grade8, grade9, grade10)
            );

        };
    }
}
