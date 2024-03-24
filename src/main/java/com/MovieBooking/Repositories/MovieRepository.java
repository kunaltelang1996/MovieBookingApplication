package com.MovieBooking.Repositories;

import com.MovieBooking.Entities.Auditorium;
import com.MovieBooking.Entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
