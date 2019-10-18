package io.avec.springbootrestxml.city;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by avec112 on 18.10.19.
 */
@Service
public class CityServiceImpl implements CityService {

    private final CityRepository repository;

    public CityServiceImpl(CityRepository repository) {
        this.repository = repository;
    }

    @Override
    public Cities findAll() {

        var cities = (List<City>) repository.findAll();
        var mycities = new Cities();
        mycities.setCities(cities);

        return mycities;
    }

    @Override
    public Optional<City> findById(Long id) {

        return repository.findById(id);
    }
}
