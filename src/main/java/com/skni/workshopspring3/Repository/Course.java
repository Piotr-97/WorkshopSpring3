package com.skni.workshopspring3.Repository;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;




@Builder
@Entity
@Data
@Table(name = "Course")
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "Semestr")
    private int semestr;

    @Column(name = "schoolname")
    private String schoolName;

    @Enumerated(EnumType.STRING)
    @Column(name = "CourseTypeEnum")
    private CourseTypeEnum courseTypeEnum;



}
