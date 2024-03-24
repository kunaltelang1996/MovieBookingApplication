package com.MovieBooking.Repositories;

import com.MovieBooking.Entities.Auditorium;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditoriumRepository extends JpaRepository<Auditorium, Integer> {
}
