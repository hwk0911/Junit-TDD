import java.util.Arrays;

public class Programmers_Sort_2 {
    public String solution(int[] numbers) {
        String answer = "";
        int[] indexes = new int[numbers.length];
        Arrays.sort(numbers);

        for(int index = 0, size = numbers.length ; index < size ; index++){
            indexes[index] = index;
        }

        indexes = GetSortIndex(SetDivisionArray(numbers), indexes, 0, numbers.length - 1);

        for(int index = 0, size = numbers.length ; index < size ; index++){
            answer += String.valueOf(numbers[indexes[index]]);
        }


        return answer;
    }

    public int[] SetDivisionArray (int[] numbers){
        int[] divisionNumber = new int[numbers.length];

        for(int index = 0, size = numbers.length ; index < size ; index++){
            divisionNumber[index] = numbers[index] % 10;
        }

        return divisionNumber;
    }

    public int[] GetSortIndex (int[] divisionNumber, int[] index, int start, int end){
        int left = start;
        int right = end;
        int pivot = divisionNumber[(left + right) / 2];
        int temp;

        do{
            while(divisionNumber[left] > pivot){
                left++;
            }
            while(divisionNumber[right] < pivot){
                right--;
            }

            if(left <= right){
                temp = divisionNumber[left];
                divisionNumber[left] = divisionNumber[right];
                divisionNumber[right] = temp;

                temp = index[left];
                index[left] = index[right];
                index[right] = temp;

                left++;
                right--;
            }
        }while(left <= right);

        if(start < right){
            GetSortIndex(divisionNumber, index, start, right);
        }

        if(end > left){
            GetSortIndex(divisionNumber, index, left, end);
        }

        return index;
    }
}
