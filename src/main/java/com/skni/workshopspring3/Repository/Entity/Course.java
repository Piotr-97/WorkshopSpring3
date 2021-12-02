package com.skni.workshopspring3.Repository.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "course")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "subject")
    private String subject;


    @Column(name = "semester")
    private Integer semester;

    @Column(name = "school")
    private String school;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private CourseTypeEnum type;


}
