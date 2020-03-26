public class Programmers_DFS_BFS_3 {
    int count;

    public int solution(String begin, String target, String[] words) {
        count = words.length + 1;

        backTracking(words,begin,target,0, new boolean[words.length]);

        int answer = 0;

        if(count != words.length + 1) {
            answer = this.count;
        }

        return answer;
    }

    public void backTracking (String[] words, String now, String target, int tempCount, boolean[] visited) {
        if(target.equals(now)) {
            count = Math.min(count, tempCount);
            return;
        }
        else if(tempCount > count) {
            return;
        }

        for(int index = 0, size = words.length ; index < size ; ++index) {
            if(!visited[index] && checkWords(now, words[index])) {
                visited[index] = !visited[index];
                backTracking(words, words[index], target, tempCount + 1, visited);
                visited[index] = !visited[index];
            }
        }
    }

    public boolean checkWords (String str1, String str2) {
        int difCount = 0;

        for(int index = 0 , size = str1.length() ; index < size ; ++index) {
            if(str1.charAt(index) != str2.charAt(index)) {
                ++difCount;
            }

            if(difCount > 1) {
                return false;
            }
        }

        if(difCount == 1){
            return true;
        }
        else {
            return false;
        }
    }
}
