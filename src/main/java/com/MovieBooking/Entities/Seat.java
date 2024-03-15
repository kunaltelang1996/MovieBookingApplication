package com.MovieBooking.Entities;

import com.MovieBooking.Entities.Constant.SeatStatus;
import com.MovieBooking.Entities.Constant.SeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    private String seatNumber;
    @Enumerated(EnumType.STRING)
    private SeatType seatType;
    private int seatRow;
    private int seatColumn;
    @Enumerated(EnumType.STRING)
    private SeatStatus seatStatus;
}
