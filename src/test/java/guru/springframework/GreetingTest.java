package guru.springframework;

import org.junit.jupiter.api.*;

public class GreetingTest {

    Greating greting;

    @BeforeAll
    public static void beforeClass(){
        System.out.println("Before - I'm only called once!");
    }

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

    @Test
    void helloWorld2(){
        System.out.println(greting.helloWorld("Jerry"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each...");
    }

    @AfterAll
    public static void afterClass(){
        System.out.println("After - O am called once!");
    }
}
