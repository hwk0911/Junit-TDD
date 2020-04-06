import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BOJ_Function_15596_정수N개의합Test {

    @Test
    void sum() {
        BOJ_Function_15596_정수N개의합 bf = new BOJ_Function_15596_정수N개의합();

        int[] a = {1,2,3,4,5};

        assertEquals(15, bf.sum(a));
    }
}