package fr.katas;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloWorldTest {

    @Test
    void Should_greet_the_world(){
        HelloWorld classUnderTest = new HelloWorld();
        Assertions.assertThat(classUnderTest.getGreeting()).isEqualTo("Hello World!");
    }

}
