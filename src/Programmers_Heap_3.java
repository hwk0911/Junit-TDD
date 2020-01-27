import java.util.PriorityQueue;

public class Programmers_Heap_3 {
    static class Job implements Comparable<Job> {
        int start;
        int requiredTime;

        Job(int start, int requiredTime) {
            this.start = start;
            this.requiredTime = requiredTime;
        }

        @Override
        public int compareTo(Job target) {
            /*
            TODO : 우선순위 큐의 정렬 방식을 설정한다.
            소요시간이 짧은 순으로, 같은 경우 들어온 시간이 빠른 순으로
            */
            if (this.requiredTime < target.requiredTime) {
                return -1;
            } else if (this.requiredTime > target.requiredTime) {
                return 1;
            } else {
                if (this.start < target.start) {
                    return -1;
                } else if (this.start > target.start) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }

        @Override
        public String toString() {
            return this.start + " " + this.requiredTime;
        }
    }

    public int solution(int[][] jobs) {
        int answer = 0;
        int progresses = 0;

        jobs = SetJobs(jobs);

        PriorityQueue<Job> jobQueue = new PriorityQueue<>();
        Job jobTemp;

        for (int index = 0, size = jobs.length; index < size; ) {
            for(; index < size && jobs[index][0] <= progresses ; index++){
                jobTemp = new Job(jobs[index][0], jobs[index][1]);
                jobQueue.offer(jobTemp);
                System.out.println("offer : " + jobTemp.toString());
            }
            if(jobQueue.isEmpty()){
                ++progresses;
            }
            else{
                jobTemp = jobQueue.poll();
                answer = AddAnswer(answer, progresses, jobTemp);
                progresses += jobTemp.requiredTime;
                System.out.println("poll : " + jobTemp.toString());
            }
            System.out.println("Status : " + progresses + " " + answer);
        }

        for(;!jobQueue.isEmpty();){
            jobTemp = jobQueue.poll();
            answer = AddAnswer(answer, progresses, jobTemp);
            progresses += jobTemp.requiredTime;
            System.out.println("poll : " + jobTemp.toString());
            System.out.println("Status : " + progresses + " " + answer);
        }

        return answer / jobs.length;
    }

    public int AddAnswer(int answer, int progresses, Job jobTemp) {
        return answer + progresses - jobTemp.start + jobTemp.requiredTime;
    }

    public int[][] SetJobs(int[][] jobs) {
        // TODO : jobs 를 들어온 순으로 정렬하고, 최초 빈 공간만큼 앞으로 당겨준다.
        int[] jobTemp;
        int pullTime;

        for(int targetLenght = jobs.length - 1 ; targetLenght > 0 ; targetLenght--){
            for(int index = 0 ; index < targetLenght ; index++){
                if(jobs[index][0] > jobs[index + 1][0]){
                    jobTemp = jobs[index];
                    jobs[index] = jobs[index + 1];
                    jobs[index + 1] = jobTemp;
                }
            }
        }

        pullTime = jobs[0][0];

        for(int index = 0, size = jobs.length ; index < size ; index++){
            jobs[index][0] -= pullTime;
        }

        return jobs;
    }
}

//progresse 사용할것
