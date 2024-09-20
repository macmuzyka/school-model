package com.schoolmodel.model;

import java.math.BigDecimal;

public class SubjectGradesDTO {
    private String studentName;
    private String subject;
    private String grades;
    private BigDecimal averageGrade;

    public SubjectGradesDTO(String studentName, String subject, String grades, BigDecimal averageGrade) {
        this.studentName = studentName;
        this.subject = subject;
        this.grades = grades;
        this.averageGrade = averageGrade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    public BigDecimal getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(BigDecimal averageGrade) {
        this.averageGrade = averageGrade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
