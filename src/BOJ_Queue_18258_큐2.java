import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_Queue_18258_큐2 {
    static class Queue extends ArrayList<Queue> {
        private Integer data;
        private Queue next = null;

        public Queue(Integer data) {
            this.data = data;
        }

        @Override
        public boolean isEmpty() {
            if (data == null && next == null)
                return true;
            else
                return false;
        }

        public void push(Integer data) {
            Queue temp = this;

            while(temp.next != null) {
                temp = temp.next;
            }

            temp.next = new Queue(data);
        }

        public Integer pop() {
            if (this.next != null) {
                Integer tempData = this.next.data;
                if (this.next.next != null) {
                    this.next = this.next.next;
                }
                return tempData;
            }
            else {
                return -1;
            }
        }

        public int size() {
            Queue temp = this;
            int size = 0;

            while (temp.next != null) {
                ++size;
                temp = temp.next;
            }

            return size;
        }

        public Integer front () {
            if (this.next != null) {
                return this.next.data;
            } else {
                return -1;
            }
        }

        public Integer back () {
            Integer tempData = 0;
            System.out.println("back in");

            if (this.next != null) {
                Queue temp = this;

                while(temp.next != null) {
                    tempData = temp.next.data;
                }
            }
            else{
                tempData = -1;
            }

            return tempData;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] order;
        Queue head = new Queue(null);
        int N = Integer.parseInt(br.readLine());

        for (int index = 0; index < N; ++index) {
            order = br.readLine().split(" ");

            switch (order[0]) {
                case "push":
                    head.push(Integer.parseInt(order[1]));
                    break;
                case "pop":
                    System.out.println(head.pop());
                    break;
                case "size":
                    System.out.println(head.size());
                    break;
                case "empty":
                    if(head.isEmpty()){
                        System.out.println(1);
                    }
                    else{
                        System.out.println(0);
                    }
                    break;
                case "front":
                    System.out.println(head.front());
                    break;
                case "back":
                    System.out.println(head.back());
                    break;
            }
        }
    }
}
