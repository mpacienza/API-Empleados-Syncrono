package com.example.empleados.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_profiles")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited

public class Profile extends Base{
    @Column(name = "IdProfile")
    private Long id;

    @Column(name = "Profile")
    private String profile;
}
