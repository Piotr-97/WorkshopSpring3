package com.skni.workshopspring3.Repository.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class StudentResponse {

    private String firstname;
    private String lastname;
    private LocalDate birthday;
    private GenderEnum gender;
    private Course course;


}
