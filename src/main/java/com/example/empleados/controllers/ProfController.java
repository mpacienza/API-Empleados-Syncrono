package com.example.empleados.controllers;

import com.example.empleados.entities.Profile;
import com.example.empleados.entities.User;
import com.example.empleados.services.ProfileService;
import com.example.empleados.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/profiles")

public class ProfController extends BaseControllerImpl<Profile, ProfileService> {

}
