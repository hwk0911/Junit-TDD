import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class Programmers_BruteForce_소수찾기Test {

    Programmers_BruteForce_소수찾기 main = new Programmers_BruteForce_소수찾기();

    @Test
    void setNumber() {
        main.setNumber(2, "", new boolean[5], "12345".toCharArray());
    }

    @Test
    void solution() {
        String number = "17";

        //assertThat(3, is(main.solution(number)));

        number = "011";
        assertThat(2, is(main.solution(number)));
    }
}