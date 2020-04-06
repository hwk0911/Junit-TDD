import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class BOJ_14681_사분면고르기Test {

    BOJ_14681_사분면고르기 main = new BOJ_14681_사분면고르기();

    @Test
    void selectQuadrant() {
        assertThat(1, is(main.selectQuadrant(1, 3)));
        assertThat(1, is(main.selectQuadrant(4, 5)));
        assertThat(3, is(main.selectQuadrant(-1, -2)));
        assertThat(2, is(main.selectQuadrant(-4, 5)));
        assertThat(4, is(main.selectQuadrant(7, -2)));
    }
}