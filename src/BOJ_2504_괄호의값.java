import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Stack;

public class BOJ_2504_괄호의값 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String removeBracket = str.replaceAll("\\(\\)", "2").replaceAll("\\[]", "3");

        if(!checkBracket(removeBracket)) {
            System.out.println(0);
        }
        else {
            System.out.println(calculator(removeBracket));
        }
    }

    public static boolean checkBracket (String brackets) {
        Stack<Character> stack = new Stack<>();

        if(brackets.length() == 0) {
            return true;
        }

        for(char bracket : brackets.toCharArray()) {
            if(bracket == '(' || bracket == '[') {
                stack.push(bracket);
            }
            else if (bracket == ')' || bracket == ']'){
                try {
                    if (bracket == ')' && stack.lastElement() == '(') {
                        stack.pop();
                    } else if (bracket == ']' && stack.lastElement() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                catch (NoSuchElementException e) {
                    return false;
                }
            }
        }

        if(!stack.isEmpty()) {
            return false;
        }
        else {
            return true;
        }
    }

    public static int calculator (String brackets) {
        int answer = 0;
        List<Integer> answers = new ArrayList<>();
        Stack<Character> stack = new Stack<>();

        int index = 0;
        answers.add(0);
        for(char bracket : brackets.toCharArray()) {
            if(bracket == ')') {
                while(!stack.isEmpty() && stack.lastElement() != '(') {
                    answers.set(index, answers.get(index) + Integer.parseInt(stack.pop().toString()));
                }
                answers.set(index, answers.get(index) * 2);
                stack.pop();
            }
            else if(bracket == ']') {
                while(!stack.isEmpty() && stack.lastElement() != '[') {
                    answers.set(index, answers.get(index) + Integer.parseInt(stack.pop().toString()));
                }
                answers.set(index, answers.get(index) * 3);
                stack.pop();
            }
            else {
                stack.push(bracket);
            }

            if(stack.isEmpty()) {
                answers.add(0);
                ++index;
            }
        }

        while(!stack.isEmpty()) {
            answers.add(Integer.parseInt(stack.pop().toString()));
        }

        for(int number : answers) {
            answer += number;
        }

        return answer;
    }
}
