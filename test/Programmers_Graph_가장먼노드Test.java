import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class Programmers_Graph_가장먼노드Test {

    Programmers_Graph_가장먼노드 main = new Programmers_Graph_가장먼노드();

    @Test
    void solution() {
        int n = 6;
        int[][] vertex = {{3, 6}, {4, 3},{3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};

        assertThat(3, is(main.solution(n, vertex)));

        n = 4;
        int[][] vertex_2 = {{1,2}, {1,3}, {3,4}, {4,2}};
        assertThat(1, is(main.solution(n, vertex_2)));

        n = 4;
        int[][] vertex_3 = {{1,2}, {1,3},
                {2,3}, {2,4},
                {3,4}};
        assertThat(1, is(main.solution(n, vertex_3)));
    }

    @Test
    void setLink() {
    }

    @Test
    void setQueue() {
    }
}