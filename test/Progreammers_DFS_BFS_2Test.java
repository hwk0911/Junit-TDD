import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Progreammers_DFS_BFS_2Test {

    @Test
    void solution() {
        Progreammers_DFS_BFS_2 pdb2 = new Progreammers_DFS_BFS_2();

        String begin = "hit";
        String target = "cog";
        String[] words = {"hot","dot","dog","lot","log","cog"};

        assertEquals(4, pdb2.solution(begin, target, words));
    }
}