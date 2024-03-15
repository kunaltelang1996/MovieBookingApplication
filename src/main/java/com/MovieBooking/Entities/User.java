package com.MovieBooking.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "MBA_USER")
public class User extends BaseModel{
    private String name;
    @Column(unique = true)
    private String email;
    @OneToMany
    private List<Ticket> tickets;
}
