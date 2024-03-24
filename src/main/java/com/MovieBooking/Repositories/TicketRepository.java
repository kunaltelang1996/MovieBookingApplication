package com.MovieBooking.Repositories;

import com.MovieBooking.Entities.MovieShow;
import com.MovieBooking.Entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}
