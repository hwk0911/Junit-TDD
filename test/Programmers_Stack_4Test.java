import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Programmers_Stack_4Test {

    @Test
    void setCircleQueue() {
        Programmers_Stack_4 ps4 = new Programmers_Stack_4();
        Programmers_Stack_4.CircleQueue circleQueue = new Programmers_Stack_4.CircleQueue();


        int[] priorities = {2, 1, 3, 2};
        circleQueue = ps4.SetCircleQueue(priorities);

        for(int index = 0, size = priorities.length ; index < size ;index++){
            System.out.println(circleQueue.location + " " + circleQueue.priorities);
            circleQueue = circleQueue.next;
        }

    }

    @Test
    void getAnswer() {
        Programmers_Stack_4 ps4 = new Programmers_Stack_4();

        int[] priorities = {2, 1, 3, 2};
        int location = 2;
        int answer = 1;

        assertEquals(answer, ps4.GetAnswer(priorities, location));

        int[] priorities_2 = {1,1,9,1,1,1};
        location = 0;
        answer = 5;

        assertEquals(answer, ps4.GetAnswer(priorities_2, location));
    }
}