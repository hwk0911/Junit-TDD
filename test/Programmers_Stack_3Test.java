import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Programmers_Stack_3Test {


    @Test
    void arrayToArrayList() {
        Programmers_Stack_3 ps3 = new Programmers_Stack_3();

        int[] progresses = {93,30,55};
        int[] speeds = {1,30,5};

        ArrayList<Integer> copyProgresses = new ArrayList<>();
        ArrayList<Integer> copySpeeds = new ArrayList<>();

        copyProgresses.add(93);
        copyProgresses.add(30);
        copyProgresses.add(55);

        copySpeeds.add(1);
        copySpeeds.add(30);
        copySpeeds.add(5);

        assertEquals(copyProgresses, ps3.ArrayToArrayList(progresses));
        assertEquals(copySpeeds, ps3.ArrayToArrayList(speeds));
    }

    @Test
    void addSpeeds() {
        Programmers_Stack_3 ps3 = new Programmers_Stack_3();

        int[] progresses = {93,30,55};
        int[] speeds = {1,30,5};

        ArrayList<Integer> copyProgresses = ps3.ArrayToArrayList(progresses);
        ArrayList<Integer> copySpeeds = ps3.ArrayToArrayList(speeds);

        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(100);
        testList.add(240);
        testList.add(90);

        assertEquals(testList, ps3.AddSpeeds(copyProgresses, copySpeeds));
    }

    @Test
    void arrayListToArray() {
        Programmers_Stack_3 ps3 = new Programmers_Stack_3();

        int[] progresses = {93,30,55};
        int[] speeds = {1,30,5};

        ArrayList<Integer> copyProgresses = new ArrayList<>();
        ArrayList<Integer> copySpeeds = new ArrayList<>();

        copyProgresses.add(93);
        copyProgresses.add(30);
        copyProgresses.add(55);

        copySpeeds.add(1);
        copySpeeds.add(30);
        copySpeeds.add(5);

        assertEquals(progresses, ps3.ArrayListToArray(copyProgresses));
        assertEquals(speeds, ps3.ArrayListToArray(copySpeeds));
    }

    @Test
    void getAnswer() {
        Programmers_Stack_3 ps3 = new Programmers_Stack_3();

        int[] progresses = {93,30,55};
        int[] speeds = {1,30,5};

        ps3.GetAnswer(progresses, speeds);
    }
}