package guru.springframework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GreetingTest {

    Greating greting;

    @BeforeEach
    void setUp() {
        System.out.println("Before each...");
        greting = new Greating();
    }

    @Test
    void helloWorld(){
        System.out.println(greting.helloWorld());
    }

    @Test
    void helloWorld1(){
        System.out.println(greting.helloWorld("Tom"));
    }
}
