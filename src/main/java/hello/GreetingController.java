package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class GreetingController {

    private static final String template = "The REST server is greeting, %s today";
    private final AtomicLong counter = new AtomicLong();

    @CrossOrigin(origins = "http://localhost:3000") // Allow requests from local clients
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="you") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}
