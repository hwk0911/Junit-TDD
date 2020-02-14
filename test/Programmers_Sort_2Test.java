import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Programmers_Sort_2Test {

    @Test
    void solution() {
        Programmers_Sort_2 ps2 = new Programmers_Sort_2();

        int numbers[] = {6, 10, 2};


        if("6210".equals(ps2.solution(numbers))){
            System.out.println("true");
        }
        else{
            System.out.println("false" + ps2.solution(numbers));
        }

        int numbers_2[] = {3,30,34,5,9};

        if("9534330".equals(ps2.solution(numbers_2))){
            System.out.println("true");
        }
        else{
            System.out.println("false" + ps2.solution(numbers_2));
        }
    }
}