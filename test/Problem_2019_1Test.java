import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class Problem_2019_1Test {

    Problem_2019_1 main = new Problem_2019_1();

    @Test
    void solution() {
        assertThat(6, is(main.solution(11, 1)));
        assertThat(5, is(main.solution(11, 2)));
        assertThat(23, is(main.solution(150000, 2)));
    }

    @Test
    void setNext() {
    }
}