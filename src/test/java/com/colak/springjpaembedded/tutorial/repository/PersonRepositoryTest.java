package com.colak.springjpaembedded.tutorial.repository;

import com.colak.springjpaembedded.tutorial.jpa.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PersonRepositoryTest {

    @Autowired
    private PersonRepository repository;

    @Test
    void findByAuthorLogin() {
        // select p1_0.id,p1_0.username,p1_1.email,p1_1.phone_number from persons p1_0
        // left join
        // person_contacts p1_1 on p1_0.id=p1_1.person_id where p1_0.id=?
        Optional<Person> optional = repository.findById(1L);
        assertThat(optional).isPresent();

        Person person = optional.get();
        assertThat(person.getUsername()).isEqualTo("JohnDoe");
    }
}
