import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Programmers_Heap_1Test {

    @Test
    void solution() {
        Programmers_Heap_1 ph1 = new Programmers_Heap_1();

        int[] scoville = {1,1,2};
        int K = 3;

        assertEquals(2, ph1.solution(scoville, K));
    }
}