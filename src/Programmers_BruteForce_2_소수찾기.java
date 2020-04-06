import java.util.ArrayList;

public class Programmers_BruteForce_2_소수찾기 {
    static ArrayList<String> combineNumber = new ArrayList<>();

    public int solution(String numbers) {
        int answer = 0;

        boolean[] primeNumber = sieve(Math.pow(10, numbers.length()));

        return answer;
    }

    public boolean[] sieve(double maxNumber) {
        boolean[] primeNumber = new boolean[(int) maxNumber];

        primeNumber[1] = true;

        for (int index = 2, size = primeNumber.length / 2; index < size; ++index) {
            if (!primeNumber[index]) {
                for (int index_2 = index * 2, size_2 = primeNumber.length; index_2 < size_2; index_2 *= 2) {
                    primeNumber[index_2] = true;
                }
            }
        }

        return primeNumber;
    }

    public void combine(char[] number, boolean[] visited, int start, int size, int count) {
        if(count == 0){

        }
    }
}

/*
백트래킹 공부하여 다시 시도할것.
 */