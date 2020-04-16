import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_11004_K번째수 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] numbers = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int index = 0 ; index < N ; ++index) {
            numbers[index] = Integer.parseInt(st.nextToken());
        }

        bw.write(quickSort(numbers, 0, N - 1, M - 1) + "");
        bw.close();
    }

    public static int quickSort (int[] numbers, int left, int right, int M) {
        int start = left;
        int end = right;
        int pivot = numbers[(start + end) / 2];

        do {
            while(numbers[start] < pivot) {
                ++start;
            }
            while(numbers[end] > pivot) {
                --end;
            }

            if(start <= end) {
                int temp = numbers[start];
                numbers[start] = numbers[end];
                numbers[end] = temp;
                ++start;
                --end;
            }
        }while (start <= end);

        if(M > end && M < start) {
            return numbers[M];
        }
        else {
            if (left < end) {
                quickSort(numbers, left, end, M);
            }
            if (right > start) {
                quickSort(numbers, start, right, M);
            }
        }

        return numbers[M];
    }
}