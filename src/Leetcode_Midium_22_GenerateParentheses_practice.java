import java.util.ArrayList;
import java.util.List;

public class Leetcode_Midium_22_GenerateParentheses_practice {
    public List<String> generateParenthesis(int n) {
        List<String> bracket = new ArrayList<>();

        getBrackets(n, 0,0,bracket,"");

        return bracket;
    }

    public void getBrackets (int n, int numOpen, int numClosed, List<String> bracket, String newBracket){
        //괄호가 완성되었는지 확인
        if(numOpen == n && numClosed == n){
            bracket.add(newBracket);
            System.out.println(newBracket);
            return;
        }

        //재귀 반복
        if(numOpen < n) {
            getBrackets(n, numOpen + 1, numClosed, bracket, newBracket + "(");
        }
        if(numClosed < numOpen ) {
            getBrackets(n, numOpen, numClosed + 1, bracket, newBracket + ")");
        }
    }
}
