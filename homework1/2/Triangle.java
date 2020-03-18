public class Triangle extends Shape {
    private double base;
    private double height;
    public Triangle (double _base, double _height){
        base=_base;
        height=_height;
    }
    public double Area(){
        return 0.5*height*base;
    }
    public String printParas(){
        return String.format("base=%.3f, height=%.3f",base,height);
    }
}