import java.util.Arrays;
import java.util.Comparator;

public class Programmers_Sort_3 {
    public int solution(int[] citations) {
        Integer[] data = changeType(citations);

        Arrays.sort(data, Comparator.reverseOrder());

        return getIndex(data);
    }

    public int getIndex (Integer[] data){
        for(int index = 0, size = data.length ; index < size ; ++index){
            if(data[index] <= index + 1){
                return data[index];
            }
        }

        return 0;
    }

    public Integer[] changeType (int[] citations){
        Integer[] copyArray = new Integer[citations.length];

        for(int index = 0, size = citations.length ; index < size ; ++index){
            copyArray[index] = citations[index];
        }

        return copyArray;
    }
}
