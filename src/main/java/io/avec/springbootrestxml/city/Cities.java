package io.avec.springbootrestxml.city;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by avec112 on 18.10.19.
 */
@Getter // Lombok
@Setter // Lombok
@JacksonXmlRootElement
public class Cities implements Serializable {

    private static final long serialVersionUID = 22L;

    @JacksonXmlProperty(localName = "City")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<City> cities = new ArrayList<>();

}
