package com.example.CrudRapido.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="tbl_student")

public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    private long student_ID;
    private String Firstname;
    private String Lastname;
    @Column(name="email_address",unique = true, nullable = false    )
    private String email;



}
