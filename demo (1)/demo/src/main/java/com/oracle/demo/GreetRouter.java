package com.oracle.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class GreetRouter {
    @Bean
    public RouterFunction<ServerResponse> route(GreetController controller) {
        return RouterFunctions.route(RequestPredicates.GET("/greet").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
                controller::greet
        );
    }
}
