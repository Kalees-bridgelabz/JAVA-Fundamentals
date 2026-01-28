package oops.line;


import java.util.Objects;

class Point{
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

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

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int x;
   int y;
}
public class Line implements LineCalculation,Comparable<Line> {

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Double getLength(){
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));

    }
    private Point p1;
    private Point p2;

    @Override
    public int compareTo(Line other) {
        return Double.compare(this.getLength(), other.getLength());
    }


    public static void main(String[] args) {
        Point a = new Point(5,3);
        Point b = new Point(10,3);

        Line l1 = new Line(new Point(8,5),new Point(8,7));
        Line l2 = new Line(new Point(5,10),new Point(7,8));

        int result = l1.compareTo(l2);
        System.out.println("result " + result);

        if (result == 0) {
            System.out.println("Both lines are equal in length");
        } else if (result < 0) {
            System.out.println("Line1 is smaller than Line2");
        } else {
            System.out.println("Line1 is greater than Line2");
        }
    }

}
