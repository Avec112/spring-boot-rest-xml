package io.avec.springbootrestxml.city;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Created by avec112 on 18.10.19.
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CitiesControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Value("http://localhost:${local.server.port}/${server.servlet.context-path}/cities")
    private String appPath;

    private City c1, c2, c3;

    @BeforeEach
    void setUp() {

        this.c1 = new City(1L, "Bratislava", 432000);
        this.c2 = new City(2L, "Budapest", 1759000);
        this.c3 = new City(3L, "Prague", 1280000);
    }

    @Test
    void findCities() {
        var paramType = new ParameterizedTypeReference<List<City>>() { };
        var cities = restTemplate.exchange(appPath, HttpMethod.GET, null, paramType);

        assertThat(cities.getBody(), hasSize(8));
        assertThat(cities.getBody(), containsInRelativeOrder(this.c1, this.c2, this.c3));
    }

    @Test
    void findCity() {
        var city = this.restTemplate.getForObject(appPath + "/1/", City.class);

        assertAll(
                () -> assertThat(city.getName(), is("Bratislava")),
                () -> assertThat(city.getPopulation(), is(432000))
        );

    }
}