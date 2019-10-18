package io.avec.springbootrestxml.city;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by avec112 on 18.10.19.
 */
@RestController
public class CitiesController {

    private final CityService cityService;

    public CitiesController(CityService cityService) {
        this.cityService = cityService;
    }

    @RequestMapping(value="/cities", produces= MediaType.APPLICATION_XML_VALUE)
    public Cities findCities() {

        return cityService.findAll();
    }

    @RequestMapping(value="/cities/{cityId}", produces=MediaType.APPLICATION_XML_VALUE)
    public City findCity(@PathVariable Long cityId) {

        return cityService.findById(cityId).orElse(null);
    }
}
