public class Main {
    public static void main(String[] args) {
        area(5);
        area(3);
        area(3, 5);
        area(-1);
        area(-3, 5);
        area(3, -5);
    }

    public static double area(double radius) {
        // take in radius, return the area
        double areaOf = radius * radius * Math.PI;
        if (radius < 0) {
            // if radius is negative, it's an invalid valid, so return -1
            return -1;
        }
        return areaOf;
    }

    public static double area(double x, double y) {
        // take in two params, where x and y both represent the sides of a rectangle and return the area
        if (x < 0 || y < 0) {
            // invalid value, return -1
            return -1;
        }
        double areaOf = x * y;
        return areaOf;
    }

}