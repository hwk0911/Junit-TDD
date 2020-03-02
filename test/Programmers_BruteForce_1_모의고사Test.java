import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Programmers_BruteForce_1_모의고사Test {

    @Test
    void solution() {
        Programmers_BruteForce_1_모의고사 pb1 = new Programmers_BruteForce_1_모의고사();

        int[] answers = {1,2,3,4,5};
        int[] answer = {1};

        assertArrayEquals(answer, pb1.solution(answers));
    }
}