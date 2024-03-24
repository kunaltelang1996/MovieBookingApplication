package com.MovieBooking.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookTicketDTO {

    private List<Integer> showSeatIds;
    private Integer userId;
}
