package fr.katas

import org.assertj.core.api.Assertions
import kotlin.test.Test
import kotlin.test.assertEquals

class HelloWorldTest {
    @Test
    fun `Should greet the world`(){
        val greeter = App()

        Assertions.assertThat(greeter.greeting).isEqualTo("Hello, World!")
    }

}
