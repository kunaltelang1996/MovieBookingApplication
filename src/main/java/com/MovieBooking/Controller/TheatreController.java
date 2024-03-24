package com.MovieBooking.Controller;

import com.MovieBooking.Entities.Theatre;
import com.MovieBooking.Service.TheatreService;
import com.MovieBooking.dto.TheatreDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TheatreController {

    @Autowired
    private TheatreService theatreService;

    @PostMapping("/theatre")
    public ResponseEntity<Theatre> createTheatre(@RequestBody TheatreDTO theatreDTO)
    {
        return ResponseEntity.ok(
                theatreService.saveTheatre(
                        theatreDTO.getName(),
                        theatreDTO.getAddress(),
                        theatreDTO.getCityId()
                )
        );
    }

}
