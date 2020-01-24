import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Programmers_Stack_6Test {

    @Test
    void solution() {
        Programmers_Stack_6Test ps6 = new Programmers_Stack_6Test();
        int[] prices = {1,2,3,2,3};
        int[] answer = {4,3,1,1,0};

        assertEquals(true, answer.equals(ps6.solution(prices)));
    }

    @Test
    void getAnswer() {
        Programmers_Stack_6Test ps6 = new Programmers_Stack_6Test();

        int[] prices = {1,2,3,2,3};
        int[] answer = {4,3,1,1,0};

        assertEquals(true, answer.equals(ps6.getAnswer(prices)));
    }
}