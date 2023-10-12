package com.gathergrid.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime dateTime;
    @ManyToOne
    private User user;
    @ManyToOne
    private Ticket ticket;

    public Reservation() {
    }

    public Reservation(Long id, LocalDateTime dateTime, User user, Ticket ticket) {
        this.id = id;
        this.dateTime = dateTime;
        this.user = user;
        this.ticket = ticket;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return Objects.equals(dateTime, that.dateTime) && Objects.equals(user, that.user) && Objects.equals(ticket, that.ticket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateTime, user, ticket);
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", dateTime=" + dateTime +
                ", user=" + user +
                ", ticket=" + ticket +
                '}';
    }
}
