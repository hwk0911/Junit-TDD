import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Programmers_Stack_5Test {

    @Test
    void replaceString() {
        Programmers_Stack_5 ps5 = new Programmers_Stack_5();

        String arrangement = "()(((()())(())()))(())";

        assertEquals("0(((00)(0)0))(0)", ps5.ReplaceString(arrangement));
    }

    @Test
    void getAnswer() {
        Programmers_Stack_5 ps5 = new Programmers_Stack_5();

        String arrangement = "()(((()())(())()))(())";

        assertEquals(17, ps5.GetAnswer(arrangement));
    }
}