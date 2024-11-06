package com.schoolmodel.model.dto;

public class ClassWithStudentCountDto {
    private Long id;
    private Long count;

    public ClassWithStudentCountDto(Long id, Long count) {
        this.id = id;
        this.count = count;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
