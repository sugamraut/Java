import java.lang.Math;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point p2) {
        double dx = this.x - p2.x;
        double dy = this.y - p2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static Point getMidPoint(Point p1, Point p2) {
        double midX = (p1.x + p2.x) / 2;
        double midY = (p1.y + p2.y) / 2;
        return new Point(midX, midY);
    }

    public static void main(String[] args) {
        // Create two Point instances
        Point P1 = new Point(1.0, 2.0);
        Point P2 = new Point(4.0, 6.0);

        // Calculate and print the distance between P1 and P2
        double distance = P1.distanceTo(P2);
        System.out.printf("Distance between P1 and P2: %.2f%n", distance);

        // Find and print the midpoint between P1 and P2
        Point P3 = Point.getMidPoint(P1, P2);
        System.out.printf("Midpoint between P1 and P2: (%.2f, %.2f)%n", P3.x, P3.y);
    }
}
