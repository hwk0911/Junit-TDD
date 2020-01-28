import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Programmers_Heap_4 {
    public int[] solution(String[] operations) {
        int[] answer = {0, 0};
        String[] temp;

        Queue<String[]> operationQueue = SetQueue(operations);
        ArrayList<Integer> dataArrayList = new ArrayList<>();

        for(;!operationQueue.isEmpty();){
            temp = operationQueue.poll();
            if(temp[0].equals("I")){
                dataArrayList.add(Integer.parseInt(temp[1]));
            }
            else if(!dataArrayList.isEmpty()){
                if(temp[1].equals("1")){
                    dataArrayList.remove(GetMaxIndex(dataArrayList));
                }
                else{
                    dataArrayList.remove(GetMinIndex(dataArrayList));
                }
            }
        }

        Collections.sort(dataArrayList);

        if(!dataArrayList.isEmpty()){
            answer[0] = dataArrayList.get(dataArrayList.size() - 1);
            answer[1] = dataArrayList.get(0);
        }

        return answer;
    }

    public Queue<String[]> SetQueue (String[] operations){
        Queue<String[]> operationQueue = new LinkedList<>();

        for(String operation : operations){
            operationQueue.offer(operation.split(" "));
        }

        return operationQueue;
    }

    public int GetMaxIndex (ArrayList<Integer> dataArrayList){
        int max = dataArrayList.get(0);
        int maxIndex = 0;

        for(int index = 1, size = dataArrayList.size() ; index < size ; index++){
            if(max < dataArrayList.get(index)){
                max = dataArrayList.get(index);
                maxIndex = index;
            }
        }

        return maxIndex;
    }

    public int GetMinIndex (ArrayList<Integer> dataArrayList){
        int min = dataArrayList.get(0);
        int minIndex = 0;

        for(int index = 1, size = dataArrayList.size() ; index < size ; index++){
            if(min > dataArrayList.get(index)){
                min = dataArrayList.get(index);
                minIndex = index;
            }
        }

        return minIndex;
    }
}
