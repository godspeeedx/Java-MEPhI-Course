package ru.mephi.java.chapter01.lab02.ex06;

// Повторите предыдущее упражнение, но на этот раз сделайте методы trans late () и scale () модифицирующими.

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
    double x;
    /**
     * y coordinate
     */
    double y;

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
     * @return the value of x coordinate
     */
    public double getY() {
        return this.y;
    }

    /**
     * Moves the point by a given amount in x- and y-direction
     *
     * @param x the amount point moves along the x axis
     * @param y the amount point moves along the y axis
     * @return modified point with new coordinates
     */
    public Point translate(double x, double y) {
        this.x += x;
        this.y += y;
        return this;
    }

    /**
     * Scales both of the coordinates by a given factor
     *
     * @param factor multiplies both of the coordinates by this value
     * @return modified point with new coordinates
     */
    public Point scale(double factor) {
        this.x *= factor;
        this.y *= factor;
        return this;
    }

    public static void main(String[] args) {
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println("\nPoint is located at " + p.getX() + " at the X axis and " + p.getY() + " at the Y axis");
    }
}