public class Programmers_DFS_BFS_3 {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;

        return answer;
    }

    public boolean CheckInnerWord(String target, String[] words) {
        for (int index = 0, size = words.length; index < size; index++) {
            if (words[index].equals(target)) {
                return true;
            }
        }

        return false;
    }

    public boolean CheckDifferentCount(String begin, String target) {
        int count = 0;

        for (int index = 0, size = begin.length(); index < size; index++) {
            if (begin.charAt(index) != target.charAt(index)) {
                ++count;
            }
        }

        return (count == 1) ? true : false;
    }

    public int DFS(String begin, String target, String[] words, int startIndex, int answer){
        if(begin.equals(target)){
            return answer;
        }

        for(int index = startIndex, size = words.length ; index < size ; index++){
            if(CheckDifferentCount(begin, words[index])){
                ++answer;

            }
        }

        return
    }
}
