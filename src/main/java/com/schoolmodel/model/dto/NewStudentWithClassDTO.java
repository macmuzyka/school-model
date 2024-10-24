package com.schoolmodel.model.dto;

public class NewStudentWithClassDTO {
    private String name;
    private String surname;
    private String className;

    public NewStudentWithClassDTO() {}

    public NewStudentWithClassDTO(String name, String surname, String className) {
        this.name = name;
        this.surname = surname;
        this.className = className;
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
}
