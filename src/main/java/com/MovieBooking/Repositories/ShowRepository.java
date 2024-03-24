package com.MovieBooking.Repositories;

import com.MovieBooking.Entities.Auditorium;
import com.MovieBooking.Entities.MovieShow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<MovieShow, Integer> {
}
