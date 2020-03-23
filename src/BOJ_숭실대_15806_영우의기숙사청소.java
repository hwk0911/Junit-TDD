import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Point {
    Integer x,y;

    Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Point getPoint () {
        return this;
    }

    public Integer getX() {
        return this.x;
    }

    public Integer getY() {
        return this.y;
    }
}

public class BOJ_숭실대_15806_영우의기숙사청소 {
    static List<Point> moldPoints;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer N,M,K,t;
        String[] getLine = br.readLine().split(" ");

        Point point;
        moldPoints = new ArrayList<>();
        List<Point> checkPoints = new ArrayList<>();

        N = Integer.parseInt(getLine[0]);
        M = Integer.parseInt(getLine[1]);
        K = Integer.parseInt(getLine[2]);
        t = Integer.parseInt(getLine[3]);

        for(int index = 0 ; index < M ; ++index) {
            getLine = br.readLine().split(" ");
            point = new Point(Integer.parseInt(getLine[0]), Integer.parseInt(getLine[1]));

            moldPoints.add(point);
        }

        for(int index = 0 ; index < K ; ++index) {
            getLine = br.readLine().split(" ");
            point = new Point(Integer.parseInt(getLine[0]), Integer.parseInt(getLine[1]));

            checkPoints.add(point);
        }

        boolean[][] room = setRoom(N, moldPoints);

        for(int lapse = 0 ; lapse < t ; ++lapse) {
            room = breeding(room, moldPoints);
        }

        checkRoom(room, checkPoints);
    }

    public static boolean[][] setRoom (Integer N, List<Point> moldPoints) {
        boolean[][] room = new boolean[N][N];

        for(int index = 0, size = moldPoints.size() ; index < size ; ++index) {
            room[moldPoints.get(index).getX()][moldPoints.get(index).getY()] = true;

        }

        return room;
    }

    public static boolean[][] breeding (boolean[][] room, List<Point> moldPoints) {
        Point point;
        List<Point> tempPoint = moldPoints;
        moldPoints = new ArrayList<>();

        for(int index = 0, size = tempPoint.size() ; index < size ; ++index) {
            point = tempPoint.get(index);

            room[point.getX()][point.getY()] = false;

            moldPoints.add(new Point(point.getX() - 2, point.getY() - 1));
            moldPoints.add(new Point(point.getX() - 2, point.getY() + 1));
            moldPoints.add(new Point(point.getX() + 2, point.getY() - 1));
            moldPoints.add(new Point(point.getX() + 2, point.getY() + 1));
            moldPoints.add(new Point(point.getX() + 1, point.getY() - 2));
            moldPoints.add(new Point(point.getX() + 1, point.getY() + 2));
            moldPoints.add(new Point(point.getX() - 1, point.getY() - 2));
            moldPoints.add(new Point(point.getX() - 1, point.getY() + 2));
        }

        for(int index = 0, size = moldPoints.size() ; index < size ; ++index) {
            point = moldPoints.get(index);

            if(point.getX() > 0 && point.getX() < room.length) {
                if(point.getY() > 0 && point.getY() < room.length) {
                    room[point.getX()][point.getY()] = true;
                }
            }
        }

        return room;
    }

    public static void checkRoom (boolean[][] room, List<Point> checkPoints) {
        Point point;

        for(int index = 0, size = checkPoints.size() ; index < size ; ++index) {
            point = checkPoints.get(index);

            if(room[point.getX()][point.getY()]) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
        return;
    }
}