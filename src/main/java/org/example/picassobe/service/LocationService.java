package org.example.picassobe.service;

import org.example.picassobe.entity.Location;
import org.example.picassobe.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    @Autowired
    private LocationRepository locationRepository;

    public List<Location>getAllLocations() {

    return locationRepository.findAll();
    }

    public Location getLocationById(Long id) {
        return locationRepository.findById(id).orElse(null);
    }

    public Location createLocation(Location location) {
        return locationRepository.save(location);
    }

    public Location updateLocation (Long id, Location updatedLocation) {
        return locationRepository.findById(id)
                .map(location -> {
                  location.setName(updatedLocation.getName());
                  location.setAddress(updatedLocation.getAddress());
                  return locationRepository.save(location);
                }).orElse(null);
    }

    public void deleteLocation (Long id) {
        locationRepository.deleteById(id);
    }
}
