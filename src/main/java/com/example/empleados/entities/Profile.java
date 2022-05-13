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

public class Profile extends Base{

    @Column(name = "Profile")
    private String profile;


}
