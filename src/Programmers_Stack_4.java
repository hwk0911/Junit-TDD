public class Programmers_Stack_4 {
    static class CircleQueue {
        int priorities = -1;
        int location = -1;
        CircleQueue next;
    }

    public int solution(int[] priorities, int location) {
        int answer = GetAnswer(priorities, location);
        return answer;
    }

    public int GetAnswer(int[] priorities, int location) {
        int answer = 0;

        CircleQueue circleQueue = SetCircleQueue(priorities);
        CircleQueue maxNode;

        for (int index = 0, size = priorities.length; index < size; index++) {
            maxNode = circleQueue;
            for (int index_2 = 0; index_2 < size; index_2++) {
                if (maxNode.priorities < circleQueue.priorities) {
                    maxNode = circleQueue;
                }
                circleQueue = circleQueue.next;
            }

            System.out.println(maxNode.priorities + " " + maxNode.location);

            if (maxNode.location == location) {
                answer = index + 1;
                return answer;
            }

            maxNode.priorities = -1;
            maxNode.location = -1;
            circleQueue = maxNode.next;
        }

        return answer;
    }

    public CircleQueue SetCircleQueue(int[] priorities) {
        CircleQueue node = new CircleQueue();
        CircleQueue head = node;
        CircleQueue temp;

        for (int index = 0, size = priorities.length; index < size; index++) {
            node.priorities = priorities[index];
            node.location = index;
            temp = new CircleQueue();
            node.next = temp;
            node = temp;
        }

        node.next = head;

        return head;
    }
}
