public class Circle extends Shape {
    private double radius;
    private double pi=3.1415926;
    public Circle (double _radius){
        radius=_radius;
    }
    public double Area(){
        return pi*radius*radius;
    }
    public String printParas(){
        return String.format("radius=%.3f\t",radius);
    }
}