package com.example.AddressBook.controllers;

import com.example.AddressBook.dto.EmployeeDTO;
import com.example.AddressBook.dto.ResponseDTO;
import com.example.AddressBook.interfaces.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressController {

    @Autowired
    IEmployeeService iEmployeeService;

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

    //UC2 --> Handling REST API using Service layer without storing in DB

    @GetMapping("/res/get/{id}")
    public ResponseDTO get2(@PathVariable Long id){
        return iEmployeeService.response("API triggered at /res/get/{id}", "Success");
    }

    @PostMapping("/res/add")
    public ResponseDTO create2(@RequestBody EmployeeDTO user){
        return iEmployeeService.response("API triggered at /res/create", "Success");
    }

    @GetMapping("/res/getAll")
    public ResponseDTO getAll2(){
        return iEmployeeService.response("API triggered at /res/getAll", "Success");
    }

    @PutMapping("/res/edit/{id}")
    public ResponseDTO edit2(@RequestBody EmployeeDTO user, @PathVariable Long id){
        return iEmployeeService.response("API triggered at /res/edit/{id}", "Success");
    }

    @DeleteMapping("/res/delete/{id}")
    public ResponseDTO delete2(@PathVariable Long id){
        return iEmployeeService.response("API triggered at /res/delete/{id}", "Success");
    }

}

