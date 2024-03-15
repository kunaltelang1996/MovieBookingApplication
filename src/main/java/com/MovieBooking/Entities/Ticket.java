package com.MovieBooking.Entities;

import com.MovieBooking.Entities.Constant.TicketStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity(name = "ticket")
public class Ticket extends BaseModel {


    private LocalDateTime timeOfBooking;

    private double totalAmount;

    @OneToMany
    private List<ShowSeat> showSeats;

    @ManyToOne
    private MovieShow movieShow;

    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;
}
