public class Problem_2019_1 {

    public int solution(int C, int B) {
        int currentTime = 0;
        boolean[] visited = new boolean[200001];
        visited[B] = true;

        while (!visited[C]) {
            ++currentTime;
            visited = setNext(visited);
            C += currentTime;

            if (C >= 200001) {
                return -1;
            }
        }

        return currentTime;
    }

    public boolean[] setNext(boolean[] visited) {
        boolean[] tempVisited = new boolean[200001];

        for (int index = 0, size = 200001; index < size; ++index) {
            if (visited[index]) {
                if (index - 1 >= 0) {
                    tempVisited[index - 1] = true;
                }
                if (index + 1 <= 200000) {
                    tempVisited[index + 1] = true;
                }
                if (index * 2 <= 200000) {
                    tempVisited[index * 2] = true;
                }
            }
        }

        return tempVisited;
    }
}
