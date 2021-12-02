package com.skni.workshopspring3.Repository;

import com.skni.workshopspring3.Repository.Entity.CourseTypeEnum;
import com.skni.workshopspring3.Repository.Entity.GenderEnum;
import com.skni.workshopspring3.Repository.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    List<Student> findAllByLastname(String lastname);

    List<Student> findAllByGenderAndCourse_type(GenderEnum gender, CourseTypeEnum type);


}
