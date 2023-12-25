import edu.princeton.cs.algs4.In;

import java.util.ArrayList;

public class BruteCollinearPoints {

    public Point[] points;

    // finds all line segments containing 4 points
    public BruteCollinearPoints(Point[] points) throws IllegalArgumentException {
        if (points == null) throw new IllegalArgumentException();
        this.points = points;
    }

    // the number of line segments
    public int numberOfSegments() {
        return this.segments().length;
    }

    // the line segments
    public LineSegment[] segments() throws IllegalArgumentException {
        ArrayList<LineSegment> lineSegments = new ArrayList<>();
        for (int i = 0; i < points.length; i++) {
            if (points[i] == null) throw new IllegalArgumentException();
            int collinear = 1;
            Point initPoint = points[i];
            for (int j = i + 1; j < points.length; j++) {
                System.out.println("j = " + j);
                double slope1 = initPoint.slopeTo(initPoint);
                double slope2 = initPoint.slopeTo(points[j]);
                System.out.println("slope2 = " + slope2);
                System.out.println("slope1 = " + slope1);
                boolean hasSameAngle = slope2 == slope1;
                if (hasSameAngle) {
                    collinear++;
                    if (collinear == 4) {
                        lineSegments.add(new LineSegment(points[i], points[j]));
                    }
                }
            }
        }

        LineSegment[] resultArray = new LineSegment[lineSegments.size()];
        lineSegments.toArray(resultArray);
        return resultArray;
    }

    public static void main(String[] args) {
        In in = new In("./collinear8.txt");
        String[] collect = in.readAll().split("\\W+");
        ArrayList<Point> pointList = new ArrayList<Point>();
        for (int i = 0; i < collect.length; i += 2) {
            int x = Integer.parseInt(collect[i]);
            int y = Integer.parseInt(collect[i + 1]);
            pointList.add(new Point(x, y));
        }
        Point[] array = pointList.toArray(new Point[pointList.size()]);
        BruteCollinearPoints bruteCollinearPoints = new BruteCollinearPoints(array);
        LineSegment[] segments = bruteCollinearPoints.segments();
        System.out.println("segments = " + segments.length);


    }
}