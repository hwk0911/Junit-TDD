public class Programmers_DFS_BFS_4 {
    String route;

    public String[] solution(String[][] tickets) {
        String[] answer = {};

        boolean[] visited = new boolean[tickets.length];
        visited[0] = true;


        setRoute(tickets, visited, tickets[0][0], tickets[0][1], 1);

        answer = route.split(" ");
        return answer;
    }

    public void setRoute(String[][] tickets, boolean[] visited, String tempRoute, String destination, int usingCount) {
        if (usingCount == tickets.length) {
            this.route = tempRoute;
            return;
        }

        for (int index = 1, size = tickets.length; index < size; ++index) {
            if (!visited[index] && checkEqaul(destination, tickets[index][0])) {
                visited[index] = !visited[index];
                setRoute(tickets, visited, tempRoute + " " + destination, tickets[index][1], usingCount + 1);
            }
        }
    }

    public boolean checkEqaul(String str1, String str2) {
        if (str1.equals(str2)) {
            return true;
        } else {
            return false;
        }
    }
}
