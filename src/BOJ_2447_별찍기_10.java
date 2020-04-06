import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_2447_별찍기_10 {
    static char[][] star;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());
        star = new char[N][N];

        for (int x = 0; x < N; ++x) {
            for (int y = 0; y < N; ++y) {
                setBlank(x, y, N);
            }
        }

        for (int x = 0; x < N; ++x) {
            for (int y = 0; y < N; ++y) {
                bw.write(star[y][x]);
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    public static void setBlank(int i, int j, int N) {
        if ((i / N) % 3 == 1 && (j / N) % 3 == 1) {
            star[i][j] = ' ';
            return;
        } else {
            if(N / 3 == 0) { // 0으로 나누는 경우 예외처리 및 *을 채워넣음.
                star[i][j] = '*';
                return;
            }
            else {
                setBlank(i, j, N / 3);
            }
        }
    }
}

/*
N이 3인 경우,
( 1, 1 )
에 빈칸이 들어감을 알 수 있다. 가해지는 연산이 x라 가정할 때,
X(i) == 1 && X(j) == 1 수식 유추가 가능하다.

N이 9인 경우,
(3, 3), (3, 4), (3, 5)
(4, 3), (4, 4), (4, 5)
(5, 3), (5, 4), (5, 5)
에 빈칸이 들어감을 알 수 있다.

위에서 X(i) == 1 && X(j) == 1 로 가정했을 때, 만족하는 수식을 찾아보면,
X = (i / 3) % 3 로 유추가 가능하다.

기본적으로 분할정복 문제이므로, divide를 진행하여 문제를 푼다면,

3, 9, 27 .. 으로 N이 증가하므로, N / 3을 통해 최소 단위를 찾는다.
따라서 N = 9 일 때, N은 3으로 쪼개지며,

(i / N) % 3 == 1 && (j / N) % 3 == 1 를 만족할 때 빈칸이 들어감을 알 수 있다.


이 문제는 후에 다시한번 풀어보는것이 좋겠다.
 */