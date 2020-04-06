import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class Programmers_DFS_BFS_3Test {
    static Programmers_DFS_BFS_3 pdb3 = new Programmers_DFS_BFS_3();

    @Test
    void solution() {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot","dot","dog","lot","log","cog"};

        assertThat(4, is(pdb3.solution(begin, target, words)));

        String[] words_2 = {"hot","dot","dog","lot","log"};

        assertThat(0, is(pdb3.solution(begin, target, words_2)));
    }

    @Test
    void testBackTracking() {
    }

    @Test
    void testCheckWords() {
        String str1 = "hit";
        String str2 = "cog";

        assertNotEquals(true, pdb3.checkWords(str1, str2));

        str1 = "hit";
        str2 = "hot";

        assertThat(true, is(pdb3.checkWords(str1, str2)));
    }
}