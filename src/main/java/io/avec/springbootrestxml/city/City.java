package io.avec.springbootrestxml.city;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by avec112 on 18.10.19.
 */
@AllArgsConstructor // Lombok
@NoArgsConstructor // Lombok
@Data // Lombok
@Entity
@Table(name = "CITIES")
@JacksonXmlRootElement(localName = "City")
public class City implements Serializable {

    private static final long serialVersionUID = 21L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JacksonXmlProperty(isAttribute = true)
    private Long id;

    @JacksonXmlProperty
    private String name;

    @JacksonXmlProperty
    private int population;

}
