import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class Leetcode_Midium_22_GenerateParentheses_practiceTest {

    @Test
    void generateParenthesis() {
        Leetcode_Midium_22_GenerateParentheses_practice leet = new Leetcode_Midium_22_GenerateParentheses_practice();

        List<String> bracket = new ArrayList<>();

        int n = 3;

        bracket.add("((()))");
        bracket.add("(()())");
        bracket.add("(())()");
        bracket.add("()(())");
        bracket.add("()()()");

        assertThat(bracket, is(leet.generateParenthesis(n)));
    }
}