package com.MovieBooking.Controller;

import com.MovieBooking.Entities.City;
import com.MovieBooking.Service.CityService;
import com.MovieBooking.dto.CityDTO;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @PostMapping("/city")
    public ResponseEntity createCity(@RequestBody CityDTO cityDTO)
    {
        try {
            String cityName = cityDTO.getName();
            if (cityName == null || cityName.length() == 0 || cityName.isEmpty() || cityName.isBlank()) {
                throw new Exception("City name is invalid");
            }

            City savedCity = cityService.SaveCity(cityName);
            return ResponseEntity.ok(savedCity);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @DeleteMapping("/city/{id}")
    public ResponseEntity deleteCity(@PathVariable("id") int cityId)
    {
        boolean isDeleted = cityService.deleteCity(cityId);
        return ResponseEntity.ok(isDeleted);
    }

    @GetMapping("/city/{name}")
    public ResponseEntity getCityByName(@PathVariable("name") String cityName)
    {
        City getCity = cityService.getCityByName(cityName);
        return ResponseEntity.ok(getCity);
    }

}
