package com.skni.workshopspring3.Services;


import com.skni.workshopspring3.Repository.Course;
import com.skni.workshopspring3.Repository.CourseTypeEnum;
import org.springframework.stereotype.Service;

@Service
public class CourseService {


    public Course addCourse(String coursename, int semestr, String schoolName, CourseTypeEnum courseTypeEnum) {



        return new Course(coursename,semestr,schoolName,courseTypeEnum);
    }
}
