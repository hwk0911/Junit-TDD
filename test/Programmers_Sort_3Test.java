import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class Programmers_Sort_3Test {

    @Test
    void solution() {
        Programmers_Sort_3 ps3 = new Programmers_Sort_3();

        int[] citations = {3, 0, 6, 1, 5};
        assertEquals(3, ps3.solution(citations));

        int[] citations_2 = {1, 3, 5, 7, 9, 11};
        assertEquals(3, ps3.solution(citations_2));

        int[] citations_3 = {100, 200, 300};
        assertEquals(0, ps3.solution(citations_3));

        int[] citations_4 = {0, 1, 1, 2, 5};
        assertEquals(2, ps3.solution(citations_4));

        int[] citations_5 = {0,1,9};
        assertEquals(1, ps3.solution(citations_5));

        int[] citations_6 = {0,0,0,0,0,0,0};
        assertEquals(0, ps3.solution(citations_6));

        int[] citations_7 = {4,3,3,3,3};
        assertEquals(3, ps3.solution(citations_7));

        int[] citations_8 = {9,9};
        assertEquals(0, ps3.solution(citations_8));

        int[] citations_9 = {2,2,2};
        assertEquals(7, ps3.solution(citations_9));
    }
}