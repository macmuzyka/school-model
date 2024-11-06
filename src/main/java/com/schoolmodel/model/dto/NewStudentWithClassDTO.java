package com.schoolmodel.model.dto;

import java.time.LocalDate;

public class NewStudentWithClassDTO {
    private String name;
    private String surname;
    private String className;
    private LocalDate birthDate;

    public NewStudentWithClassDTO() {}

    public NewStudentWithClassDTO(String name, String surname, String className, LocalDate birtDate) {
        this.name = name;
        this.surname = surname;
        this.className = className;
        this.birthDate = birtDate;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getClassName() {
        return className;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
