package com.schoolmodel.model.dto;

import com.schoolmodel.model.SchoolClass;

import java.util.List;

public class SimpleClassDTO {
    private final String className;
    private final List<StudentDTO> classStudents;

    @Override
    public String toString() {
        return "SimpleClassDTO{" +
                "className='" + className + '\'' +
                ", classStudents=" + classStudents +
                '}';
    }

    public SimpleClassDTO(SchoolClass schoolClass) {
        this.className = schoolClass.className();
        this.classStudents = schoolClass.getClassStudents().stream().map(StudentDTO::new).toList();
    }

    public String getClassName() {
        return className;
    }

    public List<StudentDTO> getClassStudents() {
        return classStudents;
    }
}
