package be.swsb.coderetreat;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloTest {

    @Test
    public void greet_ShouldReturnWorld() {
        assertThat(new Hello().greet()).isEqualTo("World!");
    }
}
