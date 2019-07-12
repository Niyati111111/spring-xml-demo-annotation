package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MovieConfig {

    @Bean
    public Actor actorBean() {
        return new Actor("Shirley Watson","female",22);
    }

    @Bean
    public Actor actorBean1() {
        return new Actor("Tom Hiddleton","male",42);
    }

    @Bean
    public Actor actorBean2() {
        return new Actor("Amy Sheldon","female",23);
    }

    @Bean
    public Movie movieBean() {
       return new Movie(actorBean());
    }

    @Bean
    public Movie movieBean1() {
        return new Movie(actorBean1());
    }

    @Bean
    public Movie movieBean2() {
        return new Movie(actorBean2());
    }

    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Bean
    public Movie movieA() {
        return new Movie(actorBean());
    }


    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Bean
    public Movie movieNewA() {
        return new Movie(actorBean());
    }




}
