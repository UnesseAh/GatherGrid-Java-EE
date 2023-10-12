package com.gathergrid.domain;


import jakarta.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;


    private Date date;

    private Time hour;

    private String location;

    private String description;
    @ManyToOne
    private Category category;

    public Event() {
    }

    public Event(Long id, String name, Date date, Time hour, String location, String description, Category category) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.hour = hour;
        this.location = location;
        this.description = description;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getHour() {
        return hour;
    }

    public void setHour(Time hour) {
        this.hour = hour;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(name, event.name) && Objects.equals(date, event.date) && Objects.equals(hour, event.hour) && Objects.equals(location, event.location) && Objects.equals(description, event.description) && Objects.equals(category, event.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date, hour, location, description, category);
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", hour=" + hour +
                ", location='" + location + '\'' +
                ", description='" + description + '\'' +
                ", category=" + category +
                '}';
    }
}
