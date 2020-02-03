import java.util.ArrayList;

public class Programmers_Sort_1_UsingQuickSort {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> tokenArray;

        for(int index = 0, size = commands.length ; index < size ; index++){
            tokenArray = SetArrayList(array, commands[index]);
            answer[index] = GetKNumber(tokenArray, 0, tokenArray.size() - 1, commands[index][2] - 1);
        }

        return answer;
    }

    public ArrayList<Integer> SetArrayList (int[] array, int[] commands){
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int index = commands[0] - 1, size = commands[1] ; index < size ; index++){
            arrayList.add(array[index]);
        }

        return arrayList;
    }

    public int GetKNumber (ArrayList<Integer> tokenArray, int left, int right, int k){
        int i = left;
        int j = right;
        int pivot = tokenArray.get((i + j) / 2);
        int temp;

        do{
            while (tokenArray.get(i) < pivot){
                i++;
            }
            while (tokenArray.get(j) > pivot){
                j--;
            }

            if(i <= j){
                temp = tokenArray.get(i);
                tokenArray.set(i, tokenArray.get(j));
                tokenArray.set(j, temp);
                i++;
                j--;
            }
        }while(i <= j);

        if(k > j && k < i){
            return tokenArray.get(k);
        }
        else {
            if(left < j){
                GetKNumber(tokenArray, left, j, k);
            }
            if(right > i){
                GetKNumber(tokenArray, i, right, k);
            }
        }

        return tokenArray.get(k);
    }
}