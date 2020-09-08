import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1260_DFS와BFS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer condition = new StringTokenizer(br.readLine(), " ");

        Integer N = Integer.parseInt(condition.nextToken());
        Integer M = Integer.parseInt(condition.nextToken());
        Integer V = Integer.parseInt(condition.nextToken());

        Map<Integer, PriorityQueue<Integer>> nodeLink= new HashMap<>();

        for(int index = 0 ; index < M ; ++index) {
            nodeLink = setNodeLink(nodeLink, new StringTokenizer(br.readLine(), " "));
        }

        Map<Integer, PriorityQueue<Integer>> BFSNodeLink = copyMap(nodeLink);

        boolean[] DFSVisited = new boolean[Math.max(N, V)];
        DFSVisited[V - 1] = true;
        boolean[] BFSVisited = Arrays.copyOf(DFSVisited, DFSVisited.length);

        System.out.println(DFS(nodeLink, new StringBuilder(V + ""), M, V, DFSVisited));
        System.out.println(BFS(BFSNodeLink, new StringBuilder(V + ""), V, BFSVisited));
    }

    public static Map<Integer, PriorityQueue<Integer>> setNodeLink (Map<Integer, PriorityQueue<Integer>> nodeLink, StringTokenizer link) {
        PriorityQueue<Integer> tempLink;

        Integer key = Integer.parseInt(link.nextToken());
        Integer value = Integer.parseInt(link.nextToken());

        if(nodeLink.containsKey(key)) {
            tempLink = nodeLink.get(key);
        }
        else {
            tempLink = new PriorityQueue<>();
        }
        tempLink.add(value);
        nodeLink.put(key, tempLink);

        if(nodeLink.containsKey(value)) {
            tempLink = nodeLink.get(value);
        }
        else {
            tempLink = new PriorityQueue<>();
        }

        tempLink.offer(key);
        nodeLink.put(value, tempLink);

        return nodeLink;
    }

    public static Map<Integer, PriorityQueue<Integer>> copyMap (Map<Integer, PriorityQueue<Integer>> nodeLink) {
        Map<Integer, PriorityQueue<Integer>> tempMap = new HashMap<>();

        Iterator<Integer> keySet = nodeLink.keySet().iterator();

        while (keySet.hasNext()) {
            Integer key = keySet.next();

            tempMap.put(key, new PriorityQueue<>(nodeLink.get(key)));
        }

        return tempMap;
    }

    public static StringBuilder DFS (Map<Integer, PriorityQueue<Integer>> nodeLink, StringBuilder sb, Integer linkCount, Integer now, boolean[] visited) {
        PriorityQueue<Integer> tempLink = nodeLink.get(now);

        if(tempLink == null) {
            return sb;
        }

        while (!tempLink.isEmpty()) {
            Integer next = tempLink.poll();
            if(visited[next - 1]) continue;

            visited[next - 1] = true;
            sb = DFS(nodeLink, sb.append(" " + next), linkCount, next, visited);
        }

        return sb;
    }

    public static StringBuilder BFS (Map<Integer, PriorityQueue<Integer>> nodeLink, StringBuilder sb, Integer now, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> tempQueue = nodeLink.get(now);

        if(tempQueue == null) {
            return sb;
        }

        while (!tempQueue.isEmpty()) {
            queue.offer(tempQueue.poll());
        }

        while (!queue.isEmpty()) {
            Integer next = queue.poll();

            if(visited[next - 1]) continue;

            Queue<Integer> nextQueue = nodeLink.get(next);
            visited[next - 1] = true;
            sb.append(" " + next);

            while (!nextQueue.isEmpty()) {
                Integer nextQueueNode = nextQueue.poll();

                if(visited[nextQueueNode - 1]) continue;

                queue.offer(nextQueueNode);
                visited[next - 1] = true;
            }

        }

        return sb;
    }
}
