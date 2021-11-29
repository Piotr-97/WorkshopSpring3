package com.skni.workshopspring3.Services;


import com.skni.workshopspring3.Repository.Course;
import com.skni.workshopspring3.Repository.GenderEnum;
import com.skni.workshopspring3.Repository.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class StudentService {


    public Student addStudent(String firstname, String lastname, LocalDate birthday, GenderEnum gender, Course course) {


        return new Student(firstname,lastname,birthday,gender,course);
    }
}
