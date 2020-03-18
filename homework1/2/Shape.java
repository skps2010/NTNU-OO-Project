public abstract class Shape implements Comparable<Shape> {
	public abstract double Area();
	public abstract String printParas();
	public String toString() {
		return String.format("%10s : %s\tarea=%.3f", getClass().getName(), printParas(), Area());
	}
	public int compareTo(Shape s) {  
        return this.getClass().getName().compareTo(s.getClass().getName());
    }
}
