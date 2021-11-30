package com.skni.workshopspring3.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    List<Student>findAllByLastName(String lastName);

    List<Student> findAll();


    void deleteById(long id);

    @Query(value = "SELECT * FROM Student student JOIN Course course ON student.course_id = course.id WHERE gender = ?1 and  CourseTypeEnum = ?2",nativeQuery = true)
    Student getStudentByGenderAndByCourseType(GenderEnum gender,CourseTypeEnum courseTypeEnum);


}