package com.example.AddressBook.controllers;

import com.example.AddressBook.dto.EmployeeDTO;
import com.example.AddressBook.dto.ResponseDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressController {

    //UC1 --> REST API handled using responseDTO(without interference of service layer)

    @GetMapping("/get/{id}")
    public ResponseDTO get1(@PathVariable Long id){
        return new ResponseDTO("API triggered at /get/","Success");
    }

    @PostMapping("/add")
    public ResponseDTO create1(@RequestBody EmployeeDTO user){
        return new ResponseDTO("API triggered at /create","Success");
    }

    @GetMapping("/getAll")
    public ResponseDTO getAll1(){
        return new ResponseDTO("API triggered at /getAll", "Success");
    }

    @PutMapping("/edit/{id}")
    public ResponseDTO edit1(@RequestBody EmployeeDTO user, @PathVariable Long id){
        return new ResponseDTO("API triggered at /edit/{id}", "Success");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseDTO delete1(@PathVariable Long id){
        return new ResponseDTO("API triggered at /delete/{id}", "Success");
    }
}
