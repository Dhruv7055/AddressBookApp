package com.example.AddressBook.interfaces;

import com.example.AddressBook.dto.AuthUserDTO;
import com.example.AddressBook.dto.LoginDTO;
import com.example.AddressBook.dto.PassDTO;
import org.springframework.stereotype.Service;

@Service
public interface IAuthInterface {

    public String register (AuthUserDTO user) throws Exception;


    public String login(LoginDTO user);

    public AuthUserDTO forgotPassword(PassDTO pass, String email) throws Exception;

    public String resetPassword(String email, String currentPass, String newPass) throws Exception;
}
