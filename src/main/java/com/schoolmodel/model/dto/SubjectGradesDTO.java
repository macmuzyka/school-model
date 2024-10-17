package com.schoolmodel.model.dto;

import com.opencsv.bean.CsvBindByName;
import com.schoolmodel.model.CsvBean;

public class SubjectGradesDTO extends CsvBean {
    @CsvBindByName(column = "Student Name")
    private String studentName;
    @CsvBindByName(column = "Subject")
    private String subject;
    @CsvBindByName(column = "Grades")
    private String grades;
    @CsvBindByName(column = "Average Grade")
    private double averageGrade;

    public SubjectGradesDTO(String studentName, String subject, String grades, double averageGrade) {
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

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "SubjectGradesDTO{" +
                "studentName='" + studentName + '\'' +
                ", subject='" + subject + '\'' +
                ", grades='" + grades + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
