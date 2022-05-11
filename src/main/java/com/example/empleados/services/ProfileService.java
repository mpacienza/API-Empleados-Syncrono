package com.example.empleados.services;

import com.example.empleados.entities.Profile;
import com.example.empleados.repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ProfileService implements BaseService<Profile> {
    @Autowired
    private ProfileRepository profileRepository;

    /*public ProfileService(ProfileRepository profileRepository){
        this.profileRepository = profileRepository;
    }*/

    @Override
    @Transactional
    public List<Profile> findAll() throws Exception {
        try{
            List<Profile> entities = profileRepository.findAll();
            return entities;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Profile findById(Long id) throws Exception {
        try{
            Optional<Profile> entityOptional = profileRepository.findById(id);
            return entityOptional.get();
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Profile save(Profile entity) throws Exception {
        try{
            entity = profileRepository.save(entity);
            return entity;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Profile update(Long id, Profile entity) throws Exception {
        try{
            Optional<Profile> entityOptional = profileRepository.findById(id);
            Profile profile = entityOptional.get();
            profile = profileRepository.save(entity);
            return profile;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        try{
            if(profileRepository.existsById(id)){
                profileRepository.deleteById(id);
                return true;
            }else {
                throw new Exception();
            }
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
