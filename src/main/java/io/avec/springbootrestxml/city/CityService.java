package io.avec.springbootrestxml.city;

import java.util.Optional;

/**
 * Created by avec112 on 18.10.19.
 */
public interface CityService {

    Cities findAll();
    Optional<City> findById(Long id);
}
