package org.example.movieapi.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Serialisation XML (default a with @XmlRootElement only)
 * <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
 * <movie>
 *     <title>Dune: Part Two</title>
 *     <year>2024</year>
 * </movie>
 *
 * Serialisation XML customized with @XmlAccessorType and @XmlAttribute
 *
 */


// lombok
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
// JAXB
@XmlRootElement(name="Movie") // default name in lower case: movie
@XmlAccessorType(XmlAccessType.FIELD)
public class Movie {

    @XmlAttribute(name="title")
    private String title;

    @XmlAttribute(name="year")
    private int year;
}
