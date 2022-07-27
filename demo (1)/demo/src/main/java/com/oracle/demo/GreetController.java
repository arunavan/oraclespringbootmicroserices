package com.oracle.demo;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Component
public class GreetController {
    private GreetRepository repository = new GreetRepository();
    public Mono<ServerResponse> greet(ServerRequest request) {
        Mono<String> result = repository.findByLanguage(Mono.just("IT"));
        return result.flatMap(this::asTextPlain);
    }
    private Mono<ServerResponse> asTextPlain(String message) {
        return ServerResponse.ok()
                .contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromObject(message)).log();
	    }
}
