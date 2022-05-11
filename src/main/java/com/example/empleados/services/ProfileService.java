package com.example.empleados.services;

import com.example.empleados.entities.Profile;
import com.example.empleados.repositories.BaseRepository;
import com.example.empleados.repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ProfileService extends BaseServiceImpl<Profile, Long> {
    @Autowired
    private ProfileRepository profileRepository;

    public ProfileService(BaseRepository<Profile, Long> baseRepository){
        super(baseRepository);
    }


}
