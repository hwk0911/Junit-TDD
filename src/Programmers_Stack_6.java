public class Programmers_Stack_6 {
    public int[] solution(int[] prices) {
        int[] answer = GetAnswer(prices);
        return answer;
    }

    public int[] GetAnswer (int[] prices){
        int[] answer = new int[prices.length];

        for(int index = 0, size = prices.length ; index < size ; index++){
            for(int index_2 = index + 1 ; index_2 < size ; index_2++){
                if(prices[index] > prices[index_2]){
                    answer[index] = index_2 - index;
                    break;
                }
                else if(index_2 == size - 1){
                    answer[index] = index_2 - index;
                }
            }
        }

        return answer;
    }
}