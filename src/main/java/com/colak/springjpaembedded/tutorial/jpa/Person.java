package com.colak.springjpaembedded.tutorial.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.SecondaryTable;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "persons")

// @SecondaryTable indicates that a secondary table (person_contacts) needs to be used for mapping additional entity fields.
@SecondaryTable(
        name = "person_contacts",
        // Defines how the primary key column of the secondary table is linked to the primary key column of the main table.
        // In our case, person_id from person_contacts refers to id in persons.
        pkJoinColumns = @PrimaryKeyJoinColumn(name = "person_id")
)

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(table = "person_contacts", name = "email")
    private String email;

    @Column(table = "person_contacts", name = "phone_number")
    private String phoneNumber;

}
