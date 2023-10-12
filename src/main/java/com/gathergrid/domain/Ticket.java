package com.gathergrid.domain;

import com.gathergrid.domain.enums.TicketType;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    @Digits(integer = 5, fraction = 2)
    private Double price;
    @NotNull
    @Min(value = 0)
    private Integer quantity;
    @NotNull
    private TicketType ticketType;
    @ManyToOne
    private Event event;

    public Ticket() {
    }

    public Ticket(Long id, Double price, Integer quantity, TicketType ticketType, Event event) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.ticketType = ticketType;
        this.event = event;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

    public void setTicketType(TicketType ticketType) {
        this.ticketType = ticketType;
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
        Ticket ticket = (Ticket) o;
        return Objects.equals(price, ticket.price) && Objects.equals(quantity, ticket.quantity) && ticketType == ticket.ticketType && Objects.equals(event, ticket.event);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, quantity, ticketType, event);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", price=" + price +
                ", quantity=" + quantity +
                ", ticketType=" + ticketType +
                ", event=" + event +
                '}';
    }
}
