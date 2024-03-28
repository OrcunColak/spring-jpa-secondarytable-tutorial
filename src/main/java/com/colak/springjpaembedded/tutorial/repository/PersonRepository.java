package com.colak.springjpaembedded.tutorial.repository;

import com.colak.springjpaembedded.tutorial.jpa.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
