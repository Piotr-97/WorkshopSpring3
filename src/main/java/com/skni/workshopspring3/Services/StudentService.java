package com.skni.workshopspring3.Services;

import com.skni.workshopspring3.Repository.Entity.Course;
import com.skni.workshopspring3.Repository.Entity.CourseTypeEnum;
import com.skni.workshopspring3.Repository.Entity.GenderEnum;
import com.skni.workshopspring3.Repository.Entity.Student;
import com.skni.workshopspring3.Repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public Student addStudent(String firstname, String lastname, LocalDate birthday, GenderEnum gender, Course course) {
        Student student = Student.builder()
                .firstname(firstname)
                .lastname(lastname)
                .birthday(birthday)
                .gender(gender)
                .course(course)
                .build();
        return studentRepository.save(student);
    }


    public List<Student> findAllByLastName(String lastname) {
        return studentRepository.findAllByLastname(lastname);
    }

    public List<Student> getStudentByGenderAndByCourseType(GenderEnum gender, CourseTypeEnum type) {
        return studentRepository.findAllByGenderAndCourse_type(gender, type);
    }

    public List<Student> getAllStudents() {

        return studentRepository.findAll();
    }

    public Boolean deleteStudentById(long id) {
        Optional<Student> student = studentRepository.findById(id);

        if (student.isPresent()) {
            studentRepository.delete(student.get());
            return true;
        } else {
            return false;
        }

    }
}
