package com.MovieBooking.Repositories;

import com.MovieBooking.Entities.MovieShow;
import com.MovieBooking.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
