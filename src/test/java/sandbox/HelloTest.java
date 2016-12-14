package sandbox;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {

    @Test
    public void test() {
        assertThat(true, is(false));
    }
}
