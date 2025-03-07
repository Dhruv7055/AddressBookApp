package com.example.AddressBook.repositories;

import com.example.AddressBook.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {

    public EmployeeEntity findByEmail(String email);
}
