package com.gathergrid.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class TicketCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String category;

    public TicketCategory() {
    }

    public TicketCategory(Long id, String category) {
        this.id = id;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
