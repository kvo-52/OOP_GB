package HW03.Figures;

public class Circle extends Figure implements  Lengthable{
    private int radius;
    public Circle(int radius){
        this.radius  = radius;
    }
    public Circle(){
        this(5);
       
    }
    public double length(){
        return 2*Math.PI*radius;
    }
    @Override
    public double area() {
        return Math.PI*radius*radius;
    }
    @Override
    public String toString() {
        return String.format("Круг");
    }
}