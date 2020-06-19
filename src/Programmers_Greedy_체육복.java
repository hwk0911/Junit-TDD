import java.util.Arrays;

public class Programmers_Greedy_체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        int[] student = new int[n];
        Arrays.fill(student, 1);

        for(int index : lost) {
            --student[index - 1];
        }

        for(int index : reserve) {
            ++student[index - 1];
        }

        for(int index = 0 ; index < n ; ++index) {
            if(student[index] == 2) {
                try {
                    if(student[index - 1] == 0) {
                        ++student[index - 1];
                        --student[index];
                    }
                    else if(student[index + 1] == 0){
                        ++student[index + 1];
                        --student[index];
                    }
                }
                catch (IndexOutOfBoundsException e) {
                    e.printStackTrace();
                }
            }
        }

        int count = 0;

        for(int index = 0 ; index < n ; ++index) {
            if(student[index] != 0) {
                ++count;
            }
        }

        answer = count;

        return answer;
    }
}