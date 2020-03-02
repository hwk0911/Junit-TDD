import java.util.ArrayList;
import java.util.List;

public class Programmers_BruteForce_1_모의고사 {
    public int[] solution(int[] answers) {
        int[] answer;

        byte[] one = {1, 2, 3, 4, 5};
        byte[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        byte[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] count = {0, 0, 0};

        for (int index = 0, size = answers.length; index < size; ++index) {
            if (one[index % one.length] == answers[index]) {
                ++count[0];
            }
            if (two[index % two.length] == answers[index]) {
                ++count[1];
            }
            if (three[index % three.length] == answers[index]) {
                ++count[2];
            }
        }
        int maxAnswer = 0;

        for (int index : count) {
            maxAnswer = Math.max(maxAnswer, index);
        }

        List<Integer> maxList = new ArrayList<>();

        for (int index = 0; index < 3; ++index) {
            if (count[index] == maxAnswer) {
                maxList.add(index + 1);
            }
        }

        answer = new int[maxList.size()];

        for (int index = 0, size = answer.length; index < size; ++index) {
            answer[index] = maxList.get(index);
        }

        return answer;
    }
}
