package com.example.empleados.controllers;

import com.example.empleados.entities.Profile;
import com.example.empleados.services.ProfileService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/profiles")

public class ProfController extends BaseControllerImpl<Profile, ProfileService> {

}
