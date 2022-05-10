package com.example.empleados.services;

import com.example.empleados.entities.User;
import com.example.empleados.repositories.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public class UserService implements BaseService<User> {
    //@Autowired
    private UserRespository userRespository;

    public UserService(UserRespository userRespository){
        this.userRespository = userRespository;
    }

    @Override
    @Transactional
    public List<User> findAll() throws Exception {
        try{
           List<User> entities = userRespository.findAll();
           return entities;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public User findById(Long id) throws Exception {
        try{
            Optional<User> entityOptional = userRespository.findById(id);
            return entityOptional.get();
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public User save(User entity) throws Exception {
        try{
            entity = userRespository.save(entity);
            return entity;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public User update(Long id, User entity) throws Exception {
        try{
            Optional<User> entityOptional = userRespository.findById(id);
            User user = entityOptional.get();
            user = userRespository.save(user);
            return user;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        try{
            if(userRespository.existsById(id)){
                userRespository.deleteById(id);
                return true;
            }else {
                throw new Exception();
            }
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
