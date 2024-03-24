package com.MovieBooking.Service;

import com.MovieBooking.Entities.City;
import com.MovieBooking.Repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public City SaveCity(String cityName)
    {
        City city = new City();
        city.setName(cityName);
        return cityRepository.save(city);
    }

    public City saveCity(City city)
    {
        return cityRepository.save(city);
    }

    public boolean deleteCity(int cityId)
    {
        cityRepository.deleteById(cityId);
        return true;
    }

    public City getCityByName(String cityName)
    {
        City city = cityRepository.findByName(cityName);
        return city;
    }

    public City getCityById(int cityId)
    {
        return cityRepository.findById(cityId).get();
    }
}
