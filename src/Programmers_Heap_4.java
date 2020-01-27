import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Programmers_Heap_4 {
    static class Data implements Comparable<Data>{
        int number;
        public Data(int number){
            this.number = number;
        }

        @Override
        public int compareTo(Data target){
            return this.number <= target.number ? 1 : -1;
        }
    }

    public int[] solution(String[] operations) {
        int[] answer = {0, 0};
        int pollCount = 0;
        int offerCount = 0;
        String[] temp;

        PriorityQueue<Integer> ascendingQueue = new PriorityQueue<>();
        PriorityQueue<Data> descendingQueue = new PriorityQueue<>();
        Data data;

        for(String operation : operations){
            temp = operation.split(" ");

            if(temp[0].equals("I")){
                data = new Data(Integer.parseInt(temp[1]));
                ascendingQueue.offer(Integer.parseInt(temp[1]));
                descendingQueue.offer(data);
                ++offerCount;
            }
            else{
                if(offerCount <= pollCount){
                    continue;
                }
                else if(temp[1].equals("1")){
                    descendingQueue.poll();
                    ++pollCount;
                }
                else{
                    ascendingQueue.poll();
                    ++pollCount;
                }
            }

        }

        if(offerCount > pollCount){
            data = descendingQueue.poll();
            answer[0] = data.number;
            answer[1] = ascendingQueue.poll();
        }

        return answer;
    }
}
