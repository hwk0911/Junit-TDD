import java.util.Stack;

public class Programmers_Stack_5 {
    public int solution(String arrangement) {
        int answer = GetAnswer(arrangement);
        return answer;
    }

    public String ReplaceString (String arrangement){
        arrangement = arrangement.replace("()", "0");

        return arrangement;
    }

    public int GetAnswer (String arrangement){
        int answer = 0;
        arrangement = ReplaceString(arrangement);

        Stack<Character> stickStack = new Stack<>();
        for(int index = 0, size = arrangement.length() ; index < size ; index++){
            if(arrangement.charAt(index) == '0'){
                answer += stickStack.size();
            }
            else if(arrangement.charAt(index) == '('){
                stickStack.push('(');
            }
            else{
                stickStack.pop();
                ++answer;
            }
        }

        return answer;
    }
}
