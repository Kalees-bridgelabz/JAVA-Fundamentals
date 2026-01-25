package line;

public class CompareTwoLines {
    public static void main(String[] args) {
        Line l1 = new Line(new Point(0, 0), new Point(4, 2));
        Line l2 = new Line(new Point(0, 0), new Point(3, 2));

        int result = l1.compareTo(l2);

        System.out.println("Line1 length = " + l1.getLength());
        System.out.println("Line2 length = " + l2.getLength());

        if (result == 0) {
            System.out.println("Both lines are equal in length");
        } else if (result < 0) {
            System.out.println("Line1 is smaller than Line2");
        } else {
            System.out.println("Line1 is greater than Line2");
        }
    }
}
