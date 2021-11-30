package com.skni.workshopspring3.Repository;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Student")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Firstname")
    private String firstname;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "Birthday")
    private LocalDate birthday;

    @Enumerated(EnumType.STRING)
    @Column(name = "Gender")
    private GenderEnum gender;



    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Course_id")
    private Course courseType;



}
