package org.example.movieapi.controller;

import org.example.movieapi.model.Movie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/movie")
public class MovieSpringController {

    Logger logger = LoggerFactory.getLogger(MovieSpringController.class);

    /**
     * GET method to abtain randomly a movie
     * URL: /api/movie/random
     *
     * Example of response with Accept: application/xml
     *    <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
     *    <Movie title="Dune: Part Two" year="2024"/>
     *
     *  Example of response with Accept: application/json
     *      {
     *          "title": "Dune: Part Two",
     *          "year": 2024
     *      }
     */
    @GetMapping("random")
    public Movie getRandomMovie(){
        return Movie.builder()
                .title("Dune: Part Two")
                .year(2024)
                .build();
    }

    /**
     * Add a new movie
     *
     * Example of XML data in input (HTTP header Content-Type: application/xml)
     *      <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
     *      <Movie title="Dune: Part One" year="2019"/>
     *
     * Example of JSON data in input (HTTP header Content-Type: application/json)
     *      *      {
     *      *          "title": "Dune: Part Two",
     *      *          "year": 2024
     *      *      }
     *
     *  The return object is serialized in JSON or XML according to HTTP Header Accept
     *
     * @param movie movie to persist
     * @return movie persisted
     */
    @PostMapping
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public Movie addMovie(@RequestBody Movie movie) {
        logger.debug("Received movie to add: " + movie);
        // TODO: persist new movie

        // return movie completed after persistence (id, default values, ...)
        return movie;
    }
}
