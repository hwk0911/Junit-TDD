import java.util.ArrayList;
import java.util.Collections;

public class Progreammers_DFS_BFS_2 {
    static ArrayList<Integer> answerList = new ArrayList<>();

    class StringNode {
        int nodeNum;
        String word;
        ArrayList<StringNode> linkedNode = new ArrayList<>();

        StringNode(int nodeNum, String word) {
            this.nodeNum = nodeNum;
            this.word = word;
        }

        private void addLinkedNode(StringNode stringNode) {
            this.linkedNode.add(stringNode);
        }

        private String getWord() {
            return this.word;
        }

        private int getListSize() {
            return this.linkedNode.size();
        }
    }

    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        boolean[] visited = new boolean[words.length];

        if(hasWord(words, target)){
            ArrayList<StringNode> nodeList= setStringNode(begin, words);
            StringNode head = linkStringNode(nodeList);

            DFS(head, visited, 0, target);

            Collections.sort(answerList);

            answer = answerList.get(0);
        }

        return answer;
    }

    public boolean checkDifferent(String string, String target) {
        int count = 0;

        for (int index = 0, size = string.length(); index < size; ++index) {
            if (string.charAt(index) != target.charAt(index)) {
                ++count;
            }
        }

        if (count != 0) {
            return false;
        }

        return true;
    }

    public ArrayList<StringNode> setStringNode(String begin, String[] words) {
        ArrayList<StringNode> stringNodeArrayList = new ArrayList<>();

        stringNodeArrayList.add(new StringNode(0, begin));

        for (int index = 0, size = words.length; index < size; ++index) {
            stringNodeArrayList.add(new StringNode(index + 1, words[index]));
        }

        return stringNodeArrayList;
    }

    public StringNode linkStringNode(ArrayList<StringNode> stringNodeArrayList) {
        for (int index = 0, size = stringNodeArrayList.size(); index < size; ++index) {
            for (int loop = 0; loop < size; ++loop) {
                if (checkDifferent(stringNodeArrayList.get(index).getWord(), stringNodeArrayList.get(loop).getWord())) {
                    stringNodeArrayList.get(index).addLinkedNode(stringNodeArrayList.get(loop));
                }
            }
        }

        return stringNodeArrayList.get(0);
    }

    public int DFS(StringNode startNode, boolean[] visited, int answer, String target) {
        visited[startNode.nodeNum] = true;

        if (startNode.getWord().equals(target)) {
            return answer;
        }

        for (int index = 0, size = startNode.getListSize(); index < size; ++index) {
            if (!visited[startNode.linkedNode.get(index).nodeNum]) {
                answer = DFS(startNode.linkedNode.get(index), visited, answer + 1, target);
                answerList.add(answer);
                answer = 0;
            }
        }

        return answer;
    }

    public boolean hasWord (String[] words, String target){
        for(int index = 0, size = words.length ; index < size ; ++index){
            if(target.equals(words[index])){
                return true;
            }
        }

        return false;
    }
}
