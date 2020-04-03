import java.util.*;

public class Programmers_Graph_순위 {
    public int solution(int n, int[][] results) {
        int answer = 0;

        Set[][] sets = resultProcess(n, results);
        answer = getCount(sets, n);

        return answer;
    }

    public Set[][] resultProcess (int n, int[][] results) {
        Set[][] sets = new Set[n][2];

        for(int index = 0 ; index < n ; ++index) {
            sets[index][0] = new HashSet<Integer>();
            sets[index][1] = new HashSet<Integer>();
        }

        for(int index = 0, size = results.length ; index < size ; ++index) {
            int winNode = results[index][0] - 1;
            int loseNode = results[index][1] - 1;

            sets[winNode][0].add(loseNode);
            sets[loseNode][1].add(winNode);
        }

        for(int index = 0, size = sets.length ; index < size ; ++index) {
            Set<Integer> winSet = sets[index][0];
            Set<Integer> loseSet = sets[index][1];

            for(int index_2 = 0 ; index_2 < size ; ++index_2) {
                if(index == index_2) {
                    continue;
                }

                if(sets[index_2][0].contains(index)) {
                    sets[index_2][0] = addSet(sets[index_2][0], winSet);
                }
                if(sets[index][0].contains(index_2)) {
                    sets[index][0] = addSet(sets[index][0], sets[index_2][0]);
                }
                if(sets[index_2][1].contains(index)) {
                    sets[index_2][1] = addSet(sets[index_2][1], loseSet);
                }
            }
        }

        return sets;
    }

    public Set<Integer> addSet (Set<Integer> set1, Set<Integer> set2) {
        Iterator<Integer> setItr = set2.iterator();

        while(setItr.hasNext()) {
            set1.add(setItr.next());
        }

        return set1;
    }

    public int getCount (Set[][] sets, int n) {
        int count = 0;

        for(Set[] set : sets) {
            int matchCount = set[0].size() + set[1].size() + 1;

            if(n == matchCount){
                ++count;
            }
        }

        return count;
    }
}
