import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class BOJ_1002_터렛Test {

    BOJ_1002_터렛 main = new BOJ_1002_터렛();

    @Test
    void getLength() {
        assertThat(1.0, is(main.getLength(0,0,1,0)));
        assertThat(Math.sqrt(2.0), is(main.getLength(0,0,1,1)));
    }

    @Test
    void getAbsoluteValue() {
        assertThat(1, is(main.getAbsoluteValue(-1)));
        assertThat(1, is(main.getAbsoluteValue(1)));
    }
}