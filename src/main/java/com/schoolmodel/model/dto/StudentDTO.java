package com.schoolmodel.model.dto;

import com.schoolmodel.model.entity.Student;

public class StudentDTO {
    private final String name;
    private final String surname;
    private final String code;
    private final boolean assigned;

    public StudentDTO(Student student) {
        this.name = student.getName();
        this.surname = student.getSurname();
        this.code = student.getCode();
        this.assigned = student.isAssigned();
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", code='" + code + '\'' +
                '}';
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

    public boolean isAssigned() {
        return assigned;
    }
}
