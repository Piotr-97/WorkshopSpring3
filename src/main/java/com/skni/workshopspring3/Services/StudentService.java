package com.skni.workshopspring3.Services;


import com.skni.workshopspring3.Repository.*;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {


    private final StudentRepository studentRepository;


    public List<Student> findAllByLastName(String lastname) {
       return studentRepository.findAllByLastName(lastname);

    }

    public List<Student> getAllStudents() {
        return  studentRepository.findAll();
    }

   // public void deleteStudentById(long id){
       // studentRepository.deleteStudentById(id);
  //  }


    public Student addStudent(String firstname, String lastname, LocalDate birthday, GenderEnum gender, Course course) {
        Student student = Student.builder()
                .firstname(firstname)
                .lastName(lastname)
                .birthday(birthday)
                .gender(gender)
                .courseType(course)
                .build();
        return studentRepository.save(student);
    }

    public Boolean deleteStudentById(long id){
        Optional<Student> student = studentRepository.findById(id);

        if(student.isPresent()){
            studentRepository.delete(student.get());
            return true;
        }else{
            return false;
        }

    }
    public Student getStudentByGenderAndByCourseType(GenderEnum gender,CourseTypeEnum courseType){
       return studentRepository.getStudentByGenderAndByCourseType(gender,courseType);
    }

}
