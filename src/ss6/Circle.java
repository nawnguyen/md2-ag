package ss6;

public class Circle {
    private double radius;
    private String color;

    public Circle() {}
    // overload
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void getColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    // override
    @Override
    public String toString() {
        return "A Circle with radius = "
                + this.radius
                + " and color = " + this.color;
    }
}

