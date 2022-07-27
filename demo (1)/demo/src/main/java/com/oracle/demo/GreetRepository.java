package com.oracle.demo;

import reactor.core.publisher.Mono;

public class GreetRepository {
    public static final int TWO_SECONDS = 2000;
    public Mono<String> findByLanguage(Mono<String> language) {
        waitFor(TWO_SECONDS);

        return Mono.just("Hello, Spring WebFlux!"+language);
    }
    private void waitFor(int milliSeconds) {
        try {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
