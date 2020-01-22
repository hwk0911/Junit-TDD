import java.util.Queue;

public class Programmers_Stack_2 {
    class Truck{
        private int weight;
        private int time;

        private void setWeight(int weight){
            this.weight = weight;
        }

        private void setTime(int time){
            this.time = time;
        }

        private int getWeight(){
            return this.weight;
        }

        private int getTime(){
            return this.time;
        }
    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        return answer;
    }

    public int SumTruckWeight(Queue<Integer> bridge) {
        int sumTruck = 0;

        for(int index = 0, size = bridge.size() ; index < size ; index++){
            sumTruck += bridge.poll();
        }

        return sumTruck;
    }

    public boolean CheckWeight(int sumTruck, int truckWeight, final int maxWeight){
        if(sumTruck + truckWeight <= maxWeight)
            return true;

        return false;
    }
}


/*
TODO 1 : 트럭 정보를 저장할 class 생성
TODO 2 : 다리 위의 총 무게 합을 반환할 함수 생성
TODO 3 : TODO2 + 새로운 트럭무게 <= weight check 함수 생성
TODO 4 : TODO3 의 결과에 따라 offer 하거나 poll 할 함수 생성
TODO 5 : TODO2 의 결과가 true 일때 모든 원소의 time 값을 -1, 새로운 트럭 offer
TODO 6_1 : TODO2 의 결과가 false 일때 answer 에 가장 앞 원소의 time 값을 더해줌
TODO 6_2 : TODO2로 true 일때까지 TODO 6_1 반복
TODO 7 : 인덱스가 truck_weights 의 마지막을 가리킬때 return answer
 */