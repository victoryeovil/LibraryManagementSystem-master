package com.librarymanagementsystem.library.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name= "Students_Table")

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String studentFirstName;
    private String StudentLastName;
    private String StudentAddress;
    private String StudentProgramme;
    private String StudentCellNumber;
}
