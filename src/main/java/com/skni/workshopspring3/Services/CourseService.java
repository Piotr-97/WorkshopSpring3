package com.skni.workshopspring3.Services;


import com.skni.workshopspring3.Repository.CourseRepository;
import com.skni.workshopspring3.Repository.Entity.Course;
import com.skni.workshopspring3.Repository.Entity.CourseRequest;
import com.skni.workshopspring3.Repository.Entity.CourseResponse;
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
    public List<CourseResponse> getCourses(){
        return courseRepository.findAll()
                .stream()
                .map(x ->modelMapper.map(x,CourseResponse.class))
                .collect(Collectors.toList());
    }

    public Optional<CourseResponse> updateCourse(Long courseId, CourseRequest courseRequest) {
        return courseRepository.findById(courseId)
                .map(x -> toEntityWithId(courseRequest, x))
                .map(courseRepository::save)
                .map(x -> modelMapper.map(x, CourseResponse.class));
    }

    private Course toEntityWithId(CourseRequest courseRequest, Course course) {
        Course entity = modelMapper.map(courseRequest, Course.class);
        entity.setId(course.getId());
        return entity;
    }


}
