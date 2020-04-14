import java.util.HashSet;
import java.util.Iterator;

public class Programmers_BruteForce_소수찾기 {
    boolean[] prime;
    HashSet<Integer> numberSet = new HashSet<>();

    public int solution(String numbers) {
        int answer = 0;

        Double primeLength = Math.pow(10, numbers.length());

        prime = new boolean[primeLength.intValue()];

        this.prime[0] = true;
        this.prime[1] = true;

        setPrime();

        for(int index = 1, size = numbers.length() ; index <= size ; ++index) {
            setNumber(index, "", new boolean[size], numbers.toCharArray());
        }

        answer = checkPrime();

        return answer;
    }

    public void setPrime () {
        for(int index = 2 ; index < prime.length / 2 ; ++index) {
            if(!prime[index]) {
                for (int index_2 = index * 2; index_2 < prime.length; index_2 += index) {
                    this.prime[index_2] = true;
                }
            }
        }
    }

    public void setNumber (int count, String number, boolean[] visited, char[] numbers) {
        if(count == 0) {
            this.numberSet.add(Integer.parseInt(number));
            return;
        }

        for(int index = 0, size = numbers.length ; index < size ; ++index) {
            if(!visited[index]) {
                visited[index] = true;
                setNumber(count - 1, number + numbers[index], visited, numbers);
                visited[index] = false;
            }
        }
    }

    public int checkPrime () {
        int count = 0;

        Iterator<Integer> numberItr = numberSet.iterator();

        while(numberItr.hasNext()) {
            if(!this.prime[numberItr.next()]) {
                ++count;
            }
        }

        return count;
    }
}