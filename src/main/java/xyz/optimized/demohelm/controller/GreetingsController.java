package xyz.optimized.demohelm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
@RequestMapping("greetings")
public class GreetingsController {
    @GetMapping()
    Flux<String> greetings(){
        return Flux.just("Hello ", "World", "!", " This ", "is ", "cool!")
                .delayElements(Duration.ofMillis(150));
    }
}
