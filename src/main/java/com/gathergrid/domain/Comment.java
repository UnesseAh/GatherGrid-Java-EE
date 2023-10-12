package com.gathergrid.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Min;
import javax.validation.constraints.Max;

import java.util.*;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return Objects.equals(assessment, comment.assessment) && Objects.equals(text, comment.text) && Objects.equals(user, comment.user) && Objects.equals(event, comment.event);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assessment, text, user, event);
    }

    @Override
    public String toString() {
        return "Comment{" + "id=" + id + ", assessment=" + assessment + ", text='" + text + '\'' + ", user=" + user + ", event=" + event + '}';
    }
}
