public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return 0.5 * height * base;
    }

    public String printParas() {
        return String.format("base=%.3f, height=%.3f", base, height);
    }
}