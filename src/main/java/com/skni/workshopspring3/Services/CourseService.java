package com.skni.workshopspring3.Services;


import com.skni.workshopspring3.Repository.CourseRepository;
import com.skni.workshopspring3.Repository.Entity.Course;
import com.skni.workshopspring3.Repository.Entity.CourseTypeEnum;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;


    public Course addCourse(String subject, Integer semester, String school, CourseTypeEnum type) {
        Course course = Course.builder()
                .subject(subject)
                .semester(semester)
                .school(school)
                .type(type)
                .build();

        return courseRepository.save(course);
    }
}
