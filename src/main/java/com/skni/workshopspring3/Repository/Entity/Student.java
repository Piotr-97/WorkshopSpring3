package com.skni.workshopspring3.Repository.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "student")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;


    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "birthday")
    private LocalDate birthday;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private GenderEnum gender;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "course_id",nullable = false)
    private Course course;








}
