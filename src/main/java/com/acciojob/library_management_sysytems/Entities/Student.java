package com.acciojob.library_management_sysytems.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "student_info")
@Getter
@Setter
@NoArgsConstructor //this is like a default constructor
@AllArgsConstructor //This is like a constructor passing argument
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollId;
    private String name;
    private String branch;
    private  double cgpa;
    private String emailId;

}