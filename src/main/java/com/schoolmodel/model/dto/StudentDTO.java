package com.schoolmodel.model.dto;

import com.schoolmodel.model.Student;

public class StudentDTO {
    private final String name;
    private final String surname;
    private final String code;

    public StudentDTO(Student student) {
        this.name = student.getName();
        this.surname = student.getSurname();
        this.code = student.getCode();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCode() {
        return code;
    }
}
