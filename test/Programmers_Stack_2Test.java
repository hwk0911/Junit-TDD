import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Programmers_Stack_2Test {

    @Test
    void checkBridgeCondition() {
        Programmers_Stack_2 ps2 = new Programmers_Stack_2();
        ArrayList<Integer> bridgeTest = new ArrayList<>();
        ArrayList<Integer> timeTest = new ArrayList<>();

        bridgeTest.add(7);
        timeTest.add(2);

        assertEquals(false, ps2.CheckBridgeCondition(bridgeTest, timeTest, 4, 10, 2 ));
        assertEquals(false, ps2.CheckBridgeCondition(bridgeTest, timeTest, 2, 10, 1 ));
    }

    @Test
    void moveTruck() {
        Programmers_Stack_2 ps2 = new Programmers_Stack_2();

        ArrayList<Integer> timeTest = new ArrayList<>();
        ArrayList<Integer> timeTest_2 = new ArrayList<>();
        ArrayList<Integer> timeTest_3 = new ArrayList<>();

        timeTest.add(2);
        timeTest.add(3);

        timeTest_2.add(1);
        timeTest_2.add(2);

        timeTest_3.add(0);
        timeTest_3.add(1);

        assertEquals(timeTest_2, ps2.MoveTruck(timeTest, 1));
        assertEquals(timeTest_3, ps2.MoveTruck(timeTest, timeTest.get(0)));
    }

    @Test
    void getAnswer(){
        Programmers_Stack_2 ps2 = new Programmers_Stack_2();

        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};

        assertEquals(8, ps2.GetAnswer(bridge_length, weight, truck_weights));
    }

    @Test
    void solution() {
        Programmers_Stack_2 ps2 = new Programmers_Stack_2();

        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};

        assertEquals(8, ps2.solution(bridge_length, weight, truck_weights));
    }
}