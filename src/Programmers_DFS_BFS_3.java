public class Programmers_DFS_BFS_3 {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;

        answer = ChangeCount(begin, target, words, 0, 0);

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

    public int ChangeCount (String begin, String target, String[] words, int startIndex, int answer){
        String tempString = begin;

        if(begin.equals(target)){
            return (answer == 0) ? Integer.MAX_VALUE : answer;
        }

        for(int index = startIndex, size = words.length ; index < size ;index++ ){
            if(CheckDifferentCount(tempString, words[index])){
                ++answer;
                tempString = words[index];
                System.out.println(answer);

            }
        }

        return Math.min(answer, ChangeCount(begin, target, words, startIndex + 1, 0));
    }
}
