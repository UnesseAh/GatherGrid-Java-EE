package com.gathergrid.domain;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    @Digits(integer = 5, fraction = 2)
    private Float price;
    @NotNull
    @Min(value = 0)
    private Integer quantity;
    @ManyToOne
    @NotNull
    private TicketCategory ticketCategory;

    public Ticket() {
    }

    public Ticket(Long id, Float price, Integer quantity, TicketCategory ticketCategory) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.ticketCategory = ticketCategory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public TicketCategory getTicketCategory() {
        return ticketCategory;
    }

    public void setTicketType(TicketCategory ticketCategory) {
        this.ticketCategory = ticketCategory;
    }
}
