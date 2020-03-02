import java.util.ArrayList;
import java.util.List;

public class Leetcode_Midium_22_GenerateParentheses {
    //backracking
    //~recursion+ termination check
    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        process(n, 0,0, "", ret);//recurse
        return ret;
    }

    // numClosednumOpen -> invalid
    public void process(int n, int numOpen, int numClosed, String str, List<String ret>) {
        //termination check
        if(numOpen == n && numClosed == n){
            ret.add(str);
            return;
        }
        //recuse next
        if(numOpen < n){
            process(n, numOpen + 1, numClosed, str+"(", ret); //add open bracket
        }
        if(numOpen > numClosed) {
            process(n, numOpen, numClosed + 1, str+")", ret); //add closed bracket
        }
    }
}

/*
참조 : https://www.youtube.com/watch?v=Bt11jaoqt_Y

 */
