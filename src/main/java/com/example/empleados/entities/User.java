package com.example.empleados.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name="tbl_profiles")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class User extends Base {
    @Column(name = "UserName")
    private int username;

    @Column(name = "Password") //Developer, DevOps
    private int password;

    /*@OneToMany(cascade = CascadeType.ALL)*/
    @Column(name="IdProfile")
    private int idprofile;

    @Column(name = "IdEmployee") //Developer, DevOps
    private int idemployee;

    @Column(name = "Status")
    private int status;

    @Column(name = "CreatedDate") //Developer, DevOps
    private int createddate;

    @Column(name = "UpdatedDate")
    private int updateddate;

    @Column(name = "Login") //Developer, DevOps
    private int login;
}
