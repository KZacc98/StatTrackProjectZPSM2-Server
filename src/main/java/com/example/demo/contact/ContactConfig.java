package com.example.demo.contact;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Configuration
public class ContactConfig {
    @Bean
    CommandLineRunner commandLineRunner(ContactRepository repository) {
        return args -> {
            Contact maddy = new Contact(
                    "Maddy Perez",
                    "madper@wp.pl",
                    "https://static.wikia.nocookie.net/euphoria-hbo/images/1/13/Maddy_Perez.jpg/revision/latest?cb=20200821140939.jpg");
            Contact jules = new Contact(
                    "Jules Vaughn",
                    "juulz@wp.pl",
                    "https://static.wikia.nocookie.net/euphoria-hbo/images/0/06/Jules_Vaughn.jpg/revision/latest/scale-to-width-down/1200?cb=20190617063942.jpg");
            Contact cassie = new Contact(
                    "cassie Howard",
                    "cascas@wp.pl",
                    "https://static.wikia.nocookie.net/euphoria-hbo/images/f/f9/Euphoria_S2_Cassie.jpg/revision/latest?cb=20220104035238.jpg");
            Contact elliot = new Contact(
                    "Elliot",
                    "ellie@wp.pl",
                    "https://static.wikia.nocookie.net/euphoria-hbo/images/7/7d/Euphoria_S2_Elliot.jpg/revision/latest?cb=20211225055956.jpg");
            repository.saveAll(
                    List.of(maddy, jules)
            );
        };
    }

}


