package com.example.AddressBook.interfaces;

import java.util.*;
import com.example.AddressBook.dto.EmployeeDTO;
import com.example.AddressBook.dto.ResponseDTO;
import com.example.AddressBook.entities.EmployeeEntity;
import org.springframework.stereotype.Service;

@Service
public interface IEmployeeService {

    public EmployeeDTO get(Long id) throws Exception;

    public EmployeeDTO create(EmployeeDTO user) throws Exception;

    public String clear();

    public List<EmployeeDTO> getAll();

    public EmployeeDTO edit(EmployeeDTO user, Long id) throws Exception;

    public String delete(Long id);

    public ResponseDTO response(String message, String status);
}
