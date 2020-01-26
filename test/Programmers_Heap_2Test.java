import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Programmers_Heap_2Test {

    @Test
    void solution() {
        Programmers_Heap_2 ph2 = new Programmers_Heap_2();
        int stock = 4;
        int[] dates = {4, 10, 15};
        int[] supplies = {20, 5, 10};
        int k = 30;

        assertEquals(2, ph2.solution(stock, dates, supplies, k));

        int stock_2 = 4;
        int[] dates_2 = {4, 10, 15};
        int[] supplies_2 = {1, 1, 1};
        int k_2 = 4;

        assertEquals(0, ph2.solution(stock_2, dates_2, supplies_2, k_2));

        int stock_3 = 5;
        int[] dates_3 = {4, 10, 15};
        int[] supplies_3 = {1, 2, 3};
        int k_3 = 6;

        assertEquals(1, ph2.solution(stock_3, dates_3, supplies_3, k_3));

        int stock_4 = 3;
        int[] dates_4 = {3, 4, 5};
        int[] supplies_4 = {1, 1, 1};
        int k_4 = 6;

        assertEquals(3, ph2.solution(stock_4, dates_4, supplies_4, k_4));

    }

    @Test
    void offerStock() {
    }

    @Test
    void setIndex() {
    }
}