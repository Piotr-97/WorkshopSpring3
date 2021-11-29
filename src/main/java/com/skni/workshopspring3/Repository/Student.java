package com.skni.workshopspring3.Repository;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Student")
@NoArgsConstructor
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "birthday")
    private LocalDate birthday;

    @Enumerated
    @Column(name = "gender")
    private GenderEnum genderEnum;

   /* @Column(name = "Course")
    private Course course;*/


}
