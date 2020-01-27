import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Programmers_Heap_4Test {

    @Test
    void solution() {
        Programmers_Heap_4 ph4 = new Programmers_Heap_4();

        String[] operations = {"I 16", "I -5643", "D -1","D 1","D 1","I 123","D -1"};
        String[] operations_2 = {"I -45","I 653","D 1","I -642","I 45","I 97","D 1","D -1","I 333"};
        int[] answer = ph4.solution(operations);
        System.out.println(answer[0] + " " + answer[1]);


        System.out.println();
        System.out.println();
        System.out.println();

        int[] answer_2 = ph4.solution(operations_2);
        System.out.println(answer_2[0] + " " + answer_2[1]);
    }
}