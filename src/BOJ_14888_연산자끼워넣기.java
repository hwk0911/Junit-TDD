import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ_14888_연산자끼워넣기 {
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer N = Integer.parseInt(br.readLine());
        List<Integer> numberList = new ArrayList<>();
        List<Integer> symbolList = new ArrayList<>();

        for (String number : br.readLine().split(" ")) {
            numberList.add(Integer.parseInt(number));
        }
        for (String symbol : br.readLine().split(" ")) {
            symbolList.add(Integer.parseInt(symbol));
        }

        backTracking(N, 1, numberList, symbolList, numberList.get(0));

        System.out.println(max);
        System.out.println(min);
    }

    public static void backTracking(int N, int now, List<Integer> numberList, List<Integer> symbolList, int result) {
        if (N == now) {
            max = Math.max(max, result);
            min = Math.min(min, result);
        }

        for (int index = 0, size = symbolList.size(); index < size; ++index) {
            if(symbolList.get(index) <= 0) continue;

            symbolList.set(index, symbolList.get(index) - 1);
            switch (index) {
                case 0:
                    backTracking(N, now + 1, numberList, symbolList, result + numberList.get(now));
                    break;
                case 1:
                    backTracking(N, now + 1, numberList, symbolList, result - numberList.get(now));
                    break;
                case 2:
                    backTracking(N, now + 1, numberList, symbolList, result * numberList.get(now));
                    break;
                case 3:
                    backTracking(N, now + 1, numberList, symbolList, result / numberList.get(now));
                    break;
            }
            symbolList.set(index, symbolList.get(index) + 1);
        }
    }
}
