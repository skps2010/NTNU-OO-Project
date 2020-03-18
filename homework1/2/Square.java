public class Square extends Shape {
    private double length;
    public Square (double _length){
        length=_length;
    }
    public double Area(){
        return length*length;
    }
    public String printParas(){
        return String.format("length=%.3f\t",length);
    }
}