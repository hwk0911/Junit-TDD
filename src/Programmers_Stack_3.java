import java.util.ArrayList;

public class Programmers_Stack_3 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = GetAnswer(progresses, speeds);
        return answer;
    }

    public int[] GetAnswer(int[] progresses, int[] speeds) {
        int count = 0;

        ArrayList<Integer> copyProgresses = ArrayToArrayList(progresses);
        ArrayList<Integer> copySpeeds = ArrayToArrayList(speeds);
        ArrayList<Integer> answer = new ArrayList<>();

        for (; !copyProgresses.isEmpty(); ) {
            copyProgresses = AddSpeeds(copyProgresses, copySpeeds);
            for (; copyProgresses.get(0) >= 100; ) {
                copyProgresses.remove(0);
                copySpeeds.remove(0);
                count++;

                if(copyProgresses.isEmpty())
                    break;
            }

            answer.add(count);
            count = 0;
        }


        return ArrayListToArray(answer);
    }

    public ArrayList<Integer> ArrayToArrayList(int[] array) {
        ArrayList<Integer> copyArray = new ArrayList<>();

        for (int index : array) {
            copyArray.add(index);
        }

        return copyArray;
    }

    public int[] ArrayListToArray (ArrayList<Integer> arrayList){
        int[] array = new int[arrayList.size()];

        for(int index = 0, size = arrayList.size() ; index < size ; index++){
            array[index] = arrayList.get(index);
        }

        return array;
    }

    public ArrayList<Integer> AddSpeeds(ArrayList<Integer> progresses, ArrayList<Integer> speeds) {
        int roop = 0;

        roop = 100 - progresses.get(0);

        if(roop % speeds.get(0) == 0){
            roop /= speeds.get(0);
        }
        else{
            roop /= speeds.get(0);
            ++roop;
        }

        for (int index = 0, size = progresses.size(); index < size; index++) {
            progresses.set(index, progresses.get(index) + (speeds.get(index) * roop));
        }

        return progresses;
    }
}
