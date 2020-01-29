import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Programmers_DFS_BFS_3Test {

    @Test
    void solution() {
        Programmers_DFS_BFS_3 pdb3 = new Programmers_DFS_BFS_3();

        String begin = "hit";
        String target = "cog";

        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

        assertEquals(4, pdb3.solution(begin, target, words));

        String begin_2 = "hit";
        String target_2 = "cog";

        String[] words_2 = {"hot", "dot", "dog", "lot", "log"};

        assertEquals(0, pdb3.solution(begin_2, target_2, words_2));
    }
}