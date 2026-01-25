package line;

import java.util.Objects;

// geting point values using point clas
class Point{
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


}

// geting line and calculate line length using line class

class Line implements Comparable<Line>{
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        boolean sameDirection =  Objects.equals(point1, line.point1) && Objects.equals(point2, line.point2);
        boolean reverseDirection =  Objects.equals(point1, line.point2) && Objects.equals(point2, line.point1);
    return sameDirection || reverseDirection;
    }

    @Override
    public int hashCode() {
        return Objects.hash(point1, point2);
    }

    Point point1;
    Point point2;

    public Line(Point p1,Point p2){
        this.point1 = p1;
        this.point2 = p2;
    }

    public Double getLength(){
        return Math.sqrt(Math.pow(point2.x - point1.x, 2) + Math.pow(point2.y - point1.y, 2));

    }

    @Override
    public int compareTo(Line other) {
        // compares based on length
        return Double.compare(this.getLength(), other.getLength());
    }

}

public class FindLineLength {
    public static void main(String[] args) {
        Point a = new Point(5,10);
        Point b = new Point(2,4);
        Line newLine = new Line(a,b);
        //get line length
        Double result = newLine.getLength();

        System.out.println("result " + result);

        Line l1 = new Line(new Point(1, 2), new Point(3, 4));
        Line l2 = new Line(new Point(3, 4), new Point(1, 2));

        System.out.println(l1.equals(l2));
    }
}
