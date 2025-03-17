package com.example.AddressBook.repositories;

import com.example.AddressBook.entities.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<ContactEntity, Long> {

    public ContactEntity findByEmail(String email);

}
