import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class Programmers_DFS_BFS_4Test {
    static Programmers_DFS_BFS_4 pdb4 = new Programmers_DFS_BFS_4();
    @Test
    public void solution() {
        String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        String[] ret = {"ICN", "JFK", "HND", "IAD"};

   //     assertThat(ret, is(pdb4.solution(tickets)));

        String[][] tickets_2 = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
        String[] ret_2 = {"ICN", "ATL", "ICN", "SFO", "ATL", "SFO"};

        assertThat(ret_2, is(pdb4.solution(tickets_2)));

        assertThat(ret, is(pdb4.solution(tickets_2)));
    }

    @Test
    public void setRoute() {
    }

    @Test
    public void checkEqaul() {
        String str1 = "ICN";
        String str2 = "ICM";

        assertThat(false,is(pdb4.checkEqaul(str1, str2)));

        str2 = "ICN";

        assertThat(true,is(pdb4.checkEqaul(str1, str2)));

    }
}