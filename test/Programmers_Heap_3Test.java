import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.*;

class Programmers_Heap_3Test {

    @Test
    void solution() {
        Programmers_Heap_3 ph3 = new Programmers_Heap_3();

        int[][] jobs = {{1,5},{2,4},{3,3},{3,2},{4,1},{4,2}};
        PriorityQueue<Programmers_Heap_3.Job> jobQueue = new PriorityQueue<>();
        Programmers_Heap_3.Job jobTemp;

        jobQueue.offer(new Programmers_Heap_3.Job(jobs[0][0], jobs[0][1]));
        jobQueue.offer(new Programmers_Heap_3.Job(jobs[1][0], jobs[1][1]));
        jobQueue.offer(new Programmers_Heap_3.Job(jobs[2][0], jobs[2][1]));


        for(;!jobQueue.isEmpty();){
            jobTemp = jobQueue.poll();
            System.out.println(jobTemp.start + " " + jobTemp.requiredTime);
        }

        assertEquals(3, ph3.solution(jobs));

    }
}