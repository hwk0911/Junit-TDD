import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Programmers_Graph_가장먼노드 {
    static boolean[] visited;

    public int solution(int n, int[][] edge) {
        int answer = 0;

        this.visited = new boolean[n];
        List<List<Integer>> nodeList = setList(n, edge);
        Queue<Integer> nodeQue = new LinkedList<>();
        nodeQue.offer(0);
        this.visited[0] = true;

        while(!nodeQue.isEmpty()) {
            answer = nodeQue.size();
            nodeQue = setQue(nodeQue, nodeList);
        }

        return answer;
    }

    public List<List<Integer>> setList (int n, int[][] edge) {
        List<List<Integer>> nodeList = new ArrayList<>();
        List<Integer> temp;

        for(int index = 0, size = n ; index < size ; ++index) {
            nodeList.add(new ArrayList<>());
        }

        for(int index = 0, size = edge.length ; index < size ; ++index) {
            int start = edge[index][0] - 1;
            int end = edge[index][1] - 1;

            temp = nodeList.get(start);

            if(!temp.contains(end)) {
                temp.add(end);
            }

            temp = nodeList.get(end);

            if(!temp.contains(start)) {
                temp.add(start);
            }
        }

        return nodeList;
    }

    public Queue<Integer> setQue (Queue<Integer> queue, List<List<Integer>> nodeList) {
        List<Integer> temp;
        Queue<Integer> newQueue = new LinkedList<>();

        while(!queue.isEmpty()) {
            temp = nodeList.get(queue.poll());

            for(int index = 0, size = temp.size() ; index < size ; ++index) {
                int nodeLink = temp.get(index);

                if(!this.visited[nodeLink]) {
                    newQueue.offer(nodeLink);
                    this.visited[nodeLink] = !this.visited[nodeLink];
                }
            }
        }

        return newQueue;
    }
}