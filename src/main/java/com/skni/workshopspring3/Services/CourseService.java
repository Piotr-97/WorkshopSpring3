package com.skni.workshopspring3.Services;


import com.skni.workshopspring3.Repository.Course;
import com.skni.workshopspring3.Repository.CourseRepository;
import com.skni.workshopspring3.Repository.CourseTypeEnum;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;

    public Course addCourse(String name, int semestr, String schoolname, CourseTypeEnum courseName) {
        Course course = Course.builder()
                .name(name)
                .semestr(semestr)
                .schoolName(schoolname)
                .courseTypeEnum(courseName)
                .build();

        return courseRepository.save(course);
    }


}
