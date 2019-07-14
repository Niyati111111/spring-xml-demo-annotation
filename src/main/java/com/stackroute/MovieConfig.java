package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MovieConfig {

    @Autowired
    @Qualifier("actor") //by name
    public Actor actorBean() {
        return new Actor("Shirley Watson","female",22);
    }

    @Autowired
    @Qualifier("Actor") //by type
    public Actor actorBean1() {
        return new Actor("Tom Hiddleton","male",42);
    }


    @Bean
    public Movie movieBean() {
       return new Movie(actorBean());
    }

    @Bean
    public Movie movieBean1() {
        return new Movie(actorBean1());
    }





}
