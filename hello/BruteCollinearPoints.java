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
            for (int j = i; j < points.length; j++) {
                if (points[j].compareTo(initPoint) == 0) throw new IllegalArgumentException();
                if (points[j].slopeOrder().compare(points[i], points[j]) == 0) {
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
}