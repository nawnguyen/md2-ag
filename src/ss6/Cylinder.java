package ss6;

public class Cylinder extends Circle {
    private double height;

    public static class Cylander {
    }

    // overload
    public Cylinder(double radius, String color, double height) {
        super(radius, color); // thành phần được kế thừa
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.height; // super.getArea() thành phần được kế thừa
    }

    // override phương thức toSString từ lớp Circle
    @Override
    public String toString() {
        return "A Cylinder with height = "
                + this.height
                + ", which is subclass of"
                + super.toString();
    }
}
