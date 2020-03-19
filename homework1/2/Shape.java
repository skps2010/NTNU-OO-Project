public abstract class Shape implements Comparable<Shape> {
	public abstract double area();

	public abstract String printParas();

	public String toString() {
		return String.format("%10s : %s\tarea=%.3f", getClass().getName(), printParas(), area());
	}

	public int compareTo(Shape s) {
		return (int) (area() - s.area());
	}
}
