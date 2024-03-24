package com.MovieBooking.Repositories;

import com.MovieBooking.Entities.Actor;
import com.MovieBooking.Entities.MovieShow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Integer> {
}
