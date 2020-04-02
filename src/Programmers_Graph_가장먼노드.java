import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Programmers_Graph_가장먼노드 {
    static boolean[] visited;

    public int solution(int n, int[][] edge) {
        int answer = 0;

        List<List<Integer>> link = setLinkNode(n, edge);
        visited = new boolean[n];
        visited[0] = true;

        Queue<Integer> que = new LinkedList<>();
        que.offer(0);

        do {
            answer = que.size();
            que = setQueue(que, link);
        }while (!que.isEmpty());

        return answer;
    }

    public List<List<Integer>> setLinkNode (int n, int[][] edge) {
        List<List<Integer>> link = new ArrayList<>();
        List<Integer> temp;

        for(int index = 0 ; index < n ; ++index) {
            link.add(new ArrayList<>());
        }

        for(int index = 0, size = edge.length ; index < size ; ++index) {
            temp = link.get(edge[index][0]);
            temp.add(edge[index][1] - 1);
            link.set(edge[index][0], temp);
        }

        for(int index = 0, size = link.size() ; index < size ; ++index) {
            temp = link.get(index);
            System.out.println(index+1 + " 연결");
            for(int i : temp) {
                System.out.println(i + 1);
            }
        }

        return link;
    }

    public Queue<Integer> setQueue (Queue<Integer> node, List<List<Integer>> link) {
        Queue<Integer> que = new LinkedList<>();
        List<Integer> temp;

        for(int nodeNum : node) {
            temp = link.get(nodeNum);

            for(int index = 0, size = temp.size() ; index < size ; ++index) {
                if(!visited[temp.get(index)]) {
                    visited[temp.get(index)] = true;
                    que.offer(temp.get(index));
                }
            }
        }

        return que;
    }
}