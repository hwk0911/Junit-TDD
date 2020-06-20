import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Programmers_Greedy_체육복Test {

    private static Programmers_Greedy_체육복 main = new Programmers_Greedy_체육복();

    @Test
    void solution() {
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        int answer = 5;

        assertEquals(answer, main.solution(n, lost, reserve));
    }
}