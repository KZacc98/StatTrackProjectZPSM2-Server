package com.example.statstrac.config;

import com.example.statstrac.model.Subject;
import com.example.statstrac.repository.SubjectRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SubjectConfig {

    @Bean
    CommandLineRunner commandLineRunner2(SubjectRepository repository) {
        return args -> {
            Subject subject1 = new Subject(
                    "Matematyka");
            Subject subject2 = new Subject(
                    "Historia");
            Subject subject3 = new Subject(
                    "Fizyka");
            Subject subject4 = new Subject(
                    "Chemia");

            repository.saveAll(
                    List.of(subject1, subject2, subject3, subject4)
            );

        };
    }

}
