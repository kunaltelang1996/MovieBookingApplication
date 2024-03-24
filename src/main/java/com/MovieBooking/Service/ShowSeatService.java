package com.MovieBooking.Service;

import com.MovieBooking.Entities.ShowSeat;
import com.MovieBooking.Repositories.ShowSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShowSeatService {

    @Autowired
    private ShowSeatRepository showSeatRepository;

    public ShowSeat getShowSeat(int showSeatId)
    {
        return showSeatRepository.findById(showSeatId).get();
    }

    public ShowSeat saveShowSeat(ShowSeat showSeat)
    {
        return showSeatRepository.save(showSeat);
    }
}
