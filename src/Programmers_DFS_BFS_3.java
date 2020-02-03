public class Programmers_DFS_BFS_3 {
    public int solution(String begin, String target, String[] words) {
        int answer = 1000;
        boolean[] visited = new boolean[words.length];

        if(!CheckWord(target, words)){
            return 0;
        }
        else if(CheckDifferentCount(begin, target)){
            return 1;
        }

        for(int index = 0, size = words.length ; index < size ; index++){
            if(CheckDifferentCount(begin, words[index])){
                visited[index] = true;
                answer = Math.min(answer, DFS(words[index], target, words, 1, visited));
            }
        }

        return answer;
    }

    public boolean CheckWord (String target, String[] words){
        for(int index = 0, size = words.length ; index < size ; index++){
            if(target.equals(words[index])){
                return true;
            }
        }
        return false;
    }

    public boolean CheckDifferentCount (String begin, String target){
        int differentCount = 0;

        for(int index = 0, size = begin.length() ; index < size ; index++){
            if(begin.charAt(index) != target.charAt(index)){
                ++differentCount;
            }
        }

        if(differentCount == 1){
            return true;
        }

        return false;
    }

    public int DFS(String begin, String target, String[] words, int count, boolean[] visited){
        int tempCount = count;


        if(begin.equals(target)){
            return count;
        }

        for(int index = 0, size = words.length ; index < size ; index++){
            if(visited[index]){
                continue;
            }

            if(CheckDifferentCount(begin, words[index])){
                System.out.println(begin);
                System.out.println(count);
                visited[index] = true;
                count = Math.min(count, DFS(words[index], target, words, tempCount + 1, visited));
            }
        }


        return count;
    }


}
