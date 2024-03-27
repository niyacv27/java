abstract class Shape{
    public abstract double CalculateArea();
    public void displayInfo(){
         System.out.println("This is a shape");
    }
}
class Rectangle extends Shape{
    int length;
    int width;
    public Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    public double CalculateArea(){
       return length*width;
    }
}
class Circle extends Shape{
    int radius;
    public Circle(int radius){
      this.radius=radius;
    }
    public double CalculateArea(){
        return Math.PI*radius*radius;
    }
}
public class AbstractMain{
     public static void main(String[] args){
         Shape rectangle=new Rectangle(5,3);
         Shape circle=new Circle(4);
         System.out.println("Area of ractangle:"+rectangle.CalculateArea());
         rectangle.displayInfo();
         System.out.println("Area of circle"+circle.CalculateArea());
         circle.displayInfo();
    }
}                                          
