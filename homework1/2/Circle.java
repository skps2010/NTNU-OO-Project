public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public String printParas() {
        return String.format("radius=%.3f\t", radius);
    }
}