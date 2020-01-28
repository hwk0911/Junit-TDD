public class Progreammers_DFS_BFS_2 {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] checkNode = new boolean[n];

        for(int index = 0 ; index < n ; index++){
            checkNode[index] = false;
        }

        for(int index = 0; index < n ; index++){
            if(checkNode[index] == false){
                ++answer;
                CheckNode(computers, checkNode, index);
            }
        }

        return answer;
    }

    public boolean[] CheckNode (int[][] computers, boolean[] checkNode, int node){
        checkNode[node] = true;

        for(int index = 0, size = computers.length ; index < size ; index++){
            if(computers[node][index] == 1){
                if(checkNode[index] == false){
                    CheckNode(computers, checkNode, index);
                }
            }
        }

        return checkNode;
    }
}
