package com.gathergrid.domain;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    @Min(value = 1)
    @Max(value = 5)
    private Integer assessment;
    @NotBlank
    private String text;
    @ManyToOne
    private User user;
    @ManyToOne
    private Event event;

    public Comment() {
    }

    public Comment(Long id, Integer assessment, String text, User user, Event event) {
        this.id = id;
        this.assessment = assessment;
        this.text = text;
        this.user = user;
        this.event = event;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAssessment() {
        return assessment;
    }

    public void setAssessment(Integer assessment) {
        this.assessment = assessment;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }


}
