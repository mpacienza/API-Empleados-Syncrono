package com.example.empleados.repositories;

import com.example.empleados.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository <E  extends Base, ID extends Serializable> extends JpaRepository<E, ID> {

}
