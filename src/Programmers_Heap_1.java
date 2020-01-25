import java.util.PriorityQueue;

public class Programmers_Heap_1 {
    public int solution(int[] scoville, int K) {
        int answer = GetAnswer(scoville, K);
        return answer;
    }

    public int GetAnswer(int[] scoville, int k){
        int answer = 0;
        int newFood = 0;

        PriorityQueue<Integer> scovillePriorityQueue = SetPriorityQueue(scoville, k);

        for(;!scovillePriorityQueue.isEmpty();){
            if(scovillePriorityQueue.peek() >= k){
                return answer;
            }
            else if(scovillePriorityQueue.size() == 1){
                return -1;
            }
            else{
                ++answer;
                newFood = ScovilleCalculator(scovillePriorityQueue.poll(), scovillePriorityQueue.poll());
                scovillePriorityQueue.offer(newFood);
            }
        }

        return answer;
    }

    public int ScovilleCalculator (int scoville_1, int scoville_2){
        return scoville_1 + (scoville_2 * 2);
    }

    public PriorityQueue<Integer> SetPriorityQueue (int[] scoville, int k){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for(int index : scoville){
                priorityQueue.offer(index);
        }

        return priorityQueue;
    }
}

/*
예외처리 신경쓸것.
ex) [1,1,2], 3 = 2
 */