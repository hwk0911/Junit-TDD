import java.util.ArrayList;
import java.util.Iterator;

public class Programmers_Stack_2 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        answer = GetAnswer(bridge_length, weight, truck_weights);
        return answer;
    }

    public int GetAnswer(int bridge_length, int weight, int[] truck_weight) {
        int answer = 0;

        ArrayList<Integer> bridge = new ArrayList<>();
        ArrayList<Integer> time = new ArrayList<>();
        ArrayList<Integer> copyTruckWeight = new ArrayList<>();

        for (int index : truck_weight) {
            copyTruckWeight.add(index);
        }

        Iterator<Integer> truckWeightIterator = copyTruckWeight.iterator();

        for (; truckWeightIterator.hasNext(); ) {
            int truckWeight = truckWeightIterator.next();

            if(!CheckBridgeCondition(bridge, time, truckWeight, weight, bridge_length)){
                for(;!CheckBridgeCondition(bridge, time, truckWeight, weight, bridge_length);) {
                    answer += time.get(0);
                    time = MoveTruck(time, time.get(0));
                    time.remove(0);
                    bridge.remove(0);
                }
            }
            else{
                time = MoveTruck(time, 1);
                answer++;
            }

            time.add(bridge_length);
            bridge.add(truckWeight);

            if(time.get(0) == 0){
                time.remove(0);
                bridge.remove(0);
            }

            System.out.println(bridge.toString() + " " + answer);
        }

        return answer + time.get(time.size() - 1);
    }

    public boolean CheckBridgeCondition(ArrayList<Integer> bridge, ArrayList<Integer> time, int truckWeigth, int weight, int bridgeLenght) {
        int sumTruckWeight = truckWeigth;

        for (int index = 0, size = bridge.size(); index < size; index++) {
            sumTruckWeight += bridge.get(index);

            if (sumTruckWeight > weight)
                return false;
        }

        if(time.size() >= bridgeLenght)
            return false;

        return true;
    }

    public ArrayList<Integer> MoveTruck(ArrayList<Integer> time, Integer decrease) {
        for (int index = 0, size = time.size(); index < size; index++) {
            time.set(index, time.get(index) - decrease);
        }

        return time;
    }
}

/*


 */