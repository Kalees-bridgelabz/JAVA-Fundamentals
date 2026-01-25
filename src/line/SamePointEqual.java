package line;

public class SamePointEqual {
    public static void main(String[] args) {
        // fine lines are same using point with help of hash code value

        Line l1 = new Line(new Point(1, 2), new Point(3, 4));
        Line l2 = new Line(new Point(3, 4), new Point(1, 5));

        System.out.println(l1.equals(l2));
    }
}
