package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MovieConfig.class);
        Movie movie = context.getBean("movieBean", Movie.class);
        System.out.println(movie.getActor());
    }

}
