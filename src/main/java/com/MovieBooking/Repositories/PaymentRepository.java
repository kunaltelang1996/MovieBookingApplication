package com.MovieBooking.Repositories;

import com.MovieBooking.Entities.MovieShow;
import com.MovieBooking.Entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
