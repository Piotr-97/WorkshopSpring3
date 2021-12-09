package com.skni.workshopspring3.Repository.Entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class StudentRequest {

    private Long id;

    @NotBlank(message = "Nie moze byc puste")
    private String firstname;
    @NotBlank(message = "Nie moze byc puste")
    private String lastname;
    private LocalDate birthday;
    @NotNull
    private GenderEnum gender;
    private Course course;


}
