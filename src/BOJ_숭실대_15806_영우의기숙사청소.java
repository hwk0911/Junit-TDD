import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Point {
    Integer x, y;

    Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return this.x;
    }

    public Integer getY() {
        return this.y;
    }

    public boolean equal(Point point) {
        if (this.getY() == point.getY() && this.getX() == point.getX()) {
            return true;
        } else {
            return false;
        }
    }
}

public class BOJ_숭실대_15806_영우의기숙사청소 {
    static List<Point> transition = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        transition.add(new Point(-2, 1));
        transition.add(new Point(-2, -1));
        transition.add(new Point(-1, 2));
        transition.add(new Point(-1, -2));
        transition.add(new Point(2, 1));
        transition.add(new Point(2, -1));
        transition.add(new Point(1, 2));
        transition.add(new Point(1, -2));

        String[] inputLine = br.readLine().split(" ");

        Integer N = Integer.parseInt(inputLine[0]);
        Integer M = Integer.parseInt(inputLine[1]);
        Integer K = Integer.parseInt(inputLine[2]);
        Integer t = Integer.parseInt(inputLine[3]);

        List<Point> moldPoints = new ArrayList<>();
        List<Point> checkPoints = new ArrayList<>();

        for(int index = 0 ; index < M ; ++index) {
            inputLine = br.readLine().split(" ");

            moldPoints.add(new Point(Integer.parseInt(inputLine[0]),
                                     Integer.parseInt(inputLine[1])));
        }

        for(int index = 0 ; index < K ; ++index) {
            inputLine = br.readLine().split(" ");

            checkPoints.add(new Point(Integer.parseInt(inputLine[0]),
                    Integer.parseInt(inputLine[1])));
        }

        for(int index = 0 ; index < t ; ++index) {
            moldPoints = breeding(moldPoints, N);
        }

        if (checkClean(checkPoints, moldPoints)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    public static List<Point> breeding(List<Point> moldPoints, Integer N) {
        List<Point> temp = new ArrayList<>();

        for(Point mold : moldPoints) {
            for(Point trans : transition) {
                Integer x = mold.getX() + trans.getX();
                Integer y = mold.getY() + trans.getY();

                if(checkWall(x, y, N)) {
                    temp.add(new Point(x, y));
                }
            }
        }

        return temp;
    }

    public static boolean checkWall(Integer x, Integer y, Integer N) {
        if (x < 0 && x > N) {
            return false;
        } else if (y < 0 && y > N) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean checkClean (List<Point> checkPoints, List<Point> moldPoints) {
        for(Point check : checkPoints) {
            for(Point mold : moldPoints) {
                if (check.equal(mold)) {
                    return true;
                }
            }
        }

        return false;
    }
}