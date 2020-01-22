import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class Programmers_Stack_2Test {

    @Test
    void SumTruckWeight() {
        Programmers_Stack_2 programmersStack2 = new Programmers_Stack_2();

        Queue<Integer> bridge = new LinkedList<>();
        bridge.add(1);
        bridge.add(2);
        bridge.add(3);
        bridge.add(4);

        assertEquals(10, programmersStack2.SumTruckWeight(bridge));
    }

    @Test
    void CheckWeight() {
        Programmers_Stack_2 programmersStack2 = new Programmers_Stack_2();

        assertEquals(false, programmersStack2.CheckWeight(10, 5, 10));
        assertEquals(true, programmersStack2.CheckWeight(10, 5, 15));
        assertEquals(true, programmersStack2.CheckWeight(10, 5, 16));
    }
}