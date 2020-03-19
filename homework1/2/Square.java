public class Square extends Shape {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double area() {
        return length * length;
    }

    public String printParas() {
        return String.format("length=%.3f\t", length);
    }
}