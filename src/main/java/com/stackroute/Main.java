package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MovieConfig.class);
        Movie movie = context.getBean("movieBean", Movie.class);
        System.out.println(movie.getActor());

        Movie movie1 = context.getBean("movieBean1", Movie.class);
        System.out.println(movie1.getActor());

        Movie movie2 = context.getBean("movieBean2", Movie.class);
        System.out.println(movie2.getActor());

        Movie movieA = context.getBean("movieA", Movie.class);
        System.out.println(movieA.getActor());

        Movie movieB = context.getBean("movieA", Movie.class);
        System.out.println(movieB.getActor());

        System.out.println(movieA == movieB);

        Movie newMovieA = context.getBean("movieNewA", Movie.class);
        System.out.println(newMovieA.getActor());

        Movie newMovieB = context.getBean("movieNewA", Movie.class);
        System.out.println(newMovieB.getActor());

        System.out.println(newMovieA == newMovieB);
    }

}
