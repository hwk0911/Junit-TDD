import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class Programmers_Graph_순위Test {
    Programmers_Graph_순위 main = new Programmers_Graph_순위();

    @Test
    void solution() {
        int n = 5;
        int[][] results = {{4, 3}, {4, 2}, {3, 2}, {1, 2}, {2, 5}};

        assertThat(2, is(main.solution(n, results)));
    }

    @Test
    void matchResult() {
    }

    @Test
    void confirmCount() {
    }
}