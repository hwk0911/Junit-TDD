import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Progreammers_DFS_BFS_2Test {

    @Test
    void solution() {
        Progreammers_DFS_BFS_2 pdb2 = new Progreammers_DFS_BFS_2();

        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        int[][] computers_2 = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};

        int n = 3;
        int n_2 = 3;

        assertEquals(2, pdb2.solution(n, computers));
        assertEquals(1, pdb2.solution(n_2, computers_2));
    }
}