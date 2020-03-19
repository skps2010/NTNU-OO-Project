import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String args[]) {
        List<Shape> shapes = new LinkedList<Shape>();

        shapes.add(new Circle(3));
        shapes.add(new Triangle(5, 7));
        shapes.add(new Square(4));
        shapes.add(new Circle(1.5));
        shapes.add(new Triangle(10, 4));
        shapes.add(new Square(0.6));
        Collections.sort(shapes);

        System.out.println("There are " + shapes.size() + " shapes: ");
        for (Shape s : shapes)
            System.out.println("" + s);

    }
}
