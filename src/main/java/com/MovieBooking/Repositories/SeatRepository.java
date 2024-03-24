package com.MovieBooking.Repositories;

import com.MovieBooking.Entities.MovieShow;
import com.MovieBooking.Entities.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat, Integer> {
}
