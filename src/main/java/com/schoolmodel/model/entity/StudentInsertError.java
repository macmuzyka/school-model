package com.schoolmodel.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "student_insert_error")
@EntityListeners(AuditingEntityListener.class)
public class StudentInsertError extends AbstractStudentEntity {
    private String errorDescription;
    private String errorCause;

    public StudentInsertError(Student student, String errorDescription, String errorCause) {
        super(student.getName(), student.getSurname(), student.getIdentifier(), student.getCode(), student.getBirthDate(), student.isAssigned());
        this.errorDescription = errorDescription;
        this.errorCause = errorCause;
    }

    public StudentInsertError() {
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String description) {
        this.errorDescription = description;
    }

    public String getErrorCause() {
        return errorCause;
    }

    public void setErrorCause(String errorCause) {
        this.errorCause = errorCause;
    }
}
