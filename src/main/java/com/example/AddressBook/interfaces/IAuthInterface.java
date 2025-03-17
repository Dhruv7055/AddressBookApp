package com.example.AddressBook.interfaces;


import com.example.AddressBook.dto.AuthUserDTO;
import com.example.AddressBook.dto.LoginDTO;
import com.example.AddressBook.dto.PassDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;

@Service
public interface IAuthInterface {

    public String register (AuthUserDTO user);


    public String login(LoginDTO user, HttpServletResponse response);

    public AuthUserDTO forgotPassword(PassDTO pass, String email);

    public String resetPassword(String email, String currentPass, String newPass);

    public String clear();

}
