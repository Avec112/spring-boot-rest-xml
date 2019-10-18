package io.avec.springbootrestxml.city;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by avec112 on 18.10.19.
 */
@Repository
public interface CityRepository extends CrudRepository<City, Long> {

}
