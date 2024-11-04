package com.schoolmodel.model.entity;

public class GradeDto {
    private int grade;
    private String subject;
    private String studentCode;

    public GradeDto(int grade, String subject, String studentCode) {
        this.grade = grade;
        this.subject = subject;
        this.studentCode = studentCode;
    }

    public GradeDto() {
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
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
                "grade=" + grade +
                ", subject='" + subject + '\'' +
                ", studentCode='" + studentCode + '\'' +
                '}';
    }
}
