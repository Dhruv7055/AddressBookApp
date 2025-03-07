package com.example.AddressBook.controllers;

import com.example.AddressBook.dto.EmployeeDTO;
import com.example.AddressBook.dto.ResponseDTO;
import com.example.AddressBook.interfaces.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    //UC3 --> Handling REST API using service layer with storage in database

    @GetMapping("res1/get/{id}")
    public EmployeeDTO get3(@PathVariable Long id){
        return iEmployeeService.get(id);
    }

    @PostMapping("res1/add")
    public EmployeeDTO create3(@RequestBody EmployeeDTO user){
        return iEmployeeService.create(user);
    }

    @GetMapping("res1/getAll")
    public List<EmployeeDTO> getAll3(){
        return iEmployeeService.getAll();
    }

    @PutMapping("res1/edit/{id}")
    public EmployeeDTO edit3(@RequestBody EmployeeDTO user, @PathVariable Long id){
        return iEmployeeService.edit(user, id);
    }

    @DeleteMapping("res1/delete/{id}")
    public String delete3(@PathVariable Long id){
        return iEmployeeService.delete(id);
    }

    @GetMapping("res1/clear")
    public String clear(){
        return iEmployeeService.clear();
    }


}

