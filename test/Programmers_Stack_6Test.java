import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Programmers_Stack_6Test {
    @Test
    void testSolution() {
        Programmers_Stack_6 ps6 = new Programmers_Stack_6();

        int[] prices = {1,2,3,2,3};
        int[] answer = {4,3,1,1,0};

        assertEquals(answer, ps6.solution(prices));
    }

    @Test
    void getAnswer() {
        Programmers_Stack_6 ps6 = new Programmers_Stack_6();

        int[] prices = {1,2,3,2,3};
        int[] answer = {4,3,1,1,0};

        assertEquals(answer, ps6.GetAnswer(prices));
    }
}