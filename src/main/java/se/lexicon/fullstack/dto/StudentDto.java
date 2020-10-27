package se.lexicon.fullstack.dto;

import java.time.LocalDate;

/**
 * Created by Mehrdad Javan
 * Date: Oct, 2020
 */
public class StudentDto {
    private int id;
    private String name;
    private String email;
    private String course;
    private LocalDate registerDate;

    public StudentDto() {
    }

    public StudentDto(int id, String name, String email, String course) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public StudentDto(int id, String name, String email, String course, LocalDate registerDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.course = course;
        this.registerDate = registerDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }
}
