package com.example.empleados.repositories;

import com.example.empleados.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends BaseRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.username LIKE %:filtro%")
    List<User> search(@Param("filtro") String filtro);
}
