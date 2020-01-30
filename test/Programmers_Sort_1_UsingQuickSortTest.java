import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Programmers_Sort_1_UsingQuickSortTest {

    @Test
    void solution() {
        Programmers_Sort_1_UsingQuickSort ps1q = new Programmers_Sort_1_UsingQuickSort();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = ps1q.solution(array, commands);

        for(int index = 0, size = answer.length ; index < size ; index++){
            System.out.println(answer[index]);
        }
    }
}