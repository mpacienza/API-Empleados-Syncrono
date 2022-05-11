package com.example.empleados.controllers;

import com.example.empleados.entities.User;
import com.example.empleados.services.BaseServiceImpl;
import com.example.empleados.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/users")
public class UserController extends BaseControllerImpl<User, UserService> {


}
