package com.MovieBooking.Controller;

import com.MovieBooking.Service.TicketService;
import com.MovieBooking.dto.BookTicketDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("/ticket")
    public ResponseEntity bookTicket(@RequestBody BookTicketDTO bookTicketDTO) throws Exception {
        return ResponseEntity.ok(ticketService.bookTicket(bookTicketDTO.getShowSeatIds(), bookTicketDTO.getUserId()));    }
}
