package com.MovieBooking.Repositories;

import com.MovieBooking.Entities.MovieShow;
import com.MovieBooking.Entities.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowSeatRepository extends JpaRepository<ShowSeat, Integer> {
}
