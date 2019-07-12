package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MovieConfig {

    @Bean
    public Actor actorBean() {
        Actor actor = new Actor();
        actor.setName("Shirley Watson");
        actor.setGender("female");
        actor.setAge(22);
        return actor;
    }

    @Bean
    public Movie movieBean() {
        Movie  movie = new Movie();
        movie.setActor(actorBean());
        return movie;
    }
}
