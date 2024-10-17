package com.schoolmodel.model.dto;

public class ExistingStudentToClassDTO {
    private String studentCode;
    private long schoolClassId;

    public ExistingStudentToClassDTO(String studentCode, long schoolClassId) {
        this.studentCode = studentCode;
        this.schoolClassId = schoolClassId;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public long getSchoolClassId() {
        return schoolClassId;
    }
}
