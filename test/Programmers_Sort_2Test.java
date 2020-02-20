import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Programmers_Sort_2Test {

    @Test
    void solution() {
        Programmers_Sort_2 ps2 = new Programmers_Sort_2();

        int numbers[] = {6, 10, 2};
        String answer = "6210";

        assertEquals(answer, ps2.solution(numbers).intern());

        int numbers_2[] = {3,30,34,5,9};
        answer = "9534330";

        assertEquals(answer, ps2.solution(numbers_2).intern());

        int numbers_3[] = {0,000,0000,0000000,0000000};
        answer = "0";

        assertEquals(answer, ps2.solution(numbers_3).intern());
    }
}