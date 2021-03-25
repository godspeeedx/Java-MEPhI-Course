package ru.mephi.java.chapter01.lab02.ex05;

// Реализуйте неизменяемый класс Point, описывающий точку на плоскости. Предоставьте его конструктор, чтобы задать
// конкретную точку; конструктор без аргументов, чтобы задать точку в начале координат; а также методы getX (), getY (),
// translate () и scale (). В частности, метод translate () должен перемещать точку на определенное расстояние в
// направлении координат х и у, а метод scale () — изменять масштаб по обеим координатам на заданный коэффициент.
// Реализуйте эти методы таким образом, чтобы они возвращали новые точки в качестве результата. Например,
// в следующей строке кода:
// Point р = new Point(3, 4).translate(1, 3).scale(0.5);

/**
 * A <code> Point <code/> object represents a point on a plane.
 *
 * @author godspeeedx
 * @version 1.0
 */
public class Point {
    /**
     * x coordinate
     */
    private double x;
    /**
     * y coordinate
     */
    private double y;

    /**
     * Constructs a point at the center of a plane.
     */

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    /**
     * Constructs a point with the given parameters.
     */

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns the value of x coordinate
     *
     * @return the value of x coordinate
     */

    public double getX() {
        return this.x;
    }

    /**
     * Returns the value of y coordinate
     *
     * @return the value of y coordinate
     */

    public double getY() {
        return this.y;
    }

    /**
     * Make a new point, that was moved by a given amount in x- and y-direction
     *
     * @param x the amount point moves along the x axis
     * @param y the amount point moves along the y axis
     * @return a new Point object with new coordinates
     */
    public Point translate(double x, double y) {
        return new Point(this.x + x, this.y + y);
    }

    /**
     * Make a new point with coordinates, that were both scaled both by a given factor
     *
     * @param factor multiplies both of the coordinates by this value
     * @return a new Point object with new coordinates
     */

    public Point scale(double factor) {
        return new Point(this.x * factor, this.y * factor);
    }

    public static void main(String[] args) {
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println("\nPoint is located at " + p.getX() + " at the X axis and " + p.getY() + " at the Y axis");
    }
}
