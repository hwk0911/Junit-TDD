import java.util.PriorityQueue;

public class Programmers_Sort_1 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        PriorityQueue<Integer> priorityQueue;

        for(int index = 0, size = commands.length ; index < size ; index++){
            priorityQueue = SetPriorityQueue(array, commands[index]);
            answer[index] = GetKnumber(priorityQueue, commands[index][2]);
        }

        return answer;
    }

    public PriorityQueue<Integer> SetPriorityQueue (int[] array, int[] commands){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for(int index = commands[0] - 1, size = commands[1] ; index < size ; index++){
            priorityQueue.offer(array[index]);
        }

        return priorityQueue;
    }

    public int GetKnumber (PriorityQueue<Integer> priorityQueue, int k){
        int kNumber = 0;

        for(int index = 0 ; index < k ; index++){
            kNumber = priorityQueue.poll();
            System.out.println(kNumber);
        }

        return kNumber;
    }
}
