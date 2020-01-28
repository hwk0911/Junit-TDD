import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Programmers_Heap_4Test {

    @Test
    void solution() {
        Programmers_Heap_4 ph4 = new Programmers_Heap_4();

        String[] operations = {"I 16", "I -5643", "D -1","D 1","D 1","I 123","D -1"};
        String[] operations_2 = {"I -45","I 653","D 1","I -642","I 45","I 97","D 1","D -1","I 333"};
        String[] operations_3 = {"I -45"};
        String[] operations_4 = {"I 4", "I 3", "I 2", "I 1", "D 1", "D 1", "D -1", "D -1", "I 5", "I 6"};

        int[] answer = ph4.solution(operations);
        System.out.println(answer[0] + " " + answer[1]);

        System.out.println();

        int[] answer_2 = ph4.solution(operations_2);
        System.out.println(answer_2[0] + " " + answer_2[1]);

        System.out.println();

        int[] answer_3 = ph4.solution(operations_3);
        System.out.println(answer_3[0] + " " + answer_3[1]);

        System.out.println();

        int[] answer_4 = ph4.solution(operations_4);
        System.out.println(answer_4[0] + " " + answer_4[1]);
    }
}