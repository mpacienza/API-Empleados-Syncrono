package com.example.empleados.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tbl_Users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class User extends Base {
    @Column(name = "UserName")
    private String username;

    @Column(name = "Password") //Developer, DevOps
    private String password;

    /*@OneToMany(cascade = CascadeType.ALL)*/
    @Column(name="IdProfile")
    private int idprofile;

    @Column(name = "IdEmployee") //Developer, DevOps
    private int idemployee;

    @Column(name = "Status")
    private int status;

    @Column(name = "CreatedDate") //Developer, DevOps
    private Date createddate;

    @Column(name = "UpdatedDate")
    private Date updateddate;

    @Column(name = "Login") //Developer, DevOps
    private int login;
}
