package com.MovieBooking.Entities;

import com.MovieBooking.Entities.Constant.PaymentModes;
import com.MovieBooking.Entities.Constant.PaymentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    private LocalDateTime paymentTime;
    private double amount;
    private String referenceId;
    @ManyToOne
    private Ticket ticket;
    private PaymentStatus paymentStatus;
    @Enumerated(EnumType.STRING)
    private PaymentModes paymentModes;
}
