package com.schoolmodel.model.dto;

public class GradeDTO {
    private int value;
    private String subject;
    private String studentCode;

    public GradeDTO(int value, String subject, String studentCode) {
        this.value = value;
        this.subject = subject;
        this.studentCode = studentCode;
    }

    public GradeDTO() {
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    @Override
    public String toString() {
        return "GradeDto{" +
                "grade=" + value +
                ", subject='" + subject + '\'' +
                ", studentCode='" + studentCode + '\'' +
                '}';
    }
}
