import java.util.*;
interface prototype{
void circle();
void rectangle();
void square();
void triangle();
}

class CircleCompute implements prototype{
Scanner inp=new Scanner(System.in);
public void circle(){
double radius;
System.out.println("Enter the radius:");
radius=inp.nextDouble();
double cir_area=3.14*radius*radius;
double cir_peri=2*3.14*radius;
System.out.println("Area of circle="+cir_area);
System.out.println("Perimeter of circle="+cir_peri);
}
public void rectangle(){}
public void triangle(){}
public void square(){}
}

class RectCompute implements prototype{
Scanner inp=new Scanner(System.in);
public void rectangle(){
double length,breadth;
System.out.println("Enter the length of the rectangle:");
length=inp.nextDouble();
System.out.println("Enter the breadth of the rectangle:");
breadth=inp.nextDouble();
double rect_area=length*breadth;
double rect_peri=2*(length+breadth);
System.out.println("Area of circle="+rect_area);
System.out.println("Perimeter of circle="+rect_peri);
}
public void circle(){}
public void triangle(){}
public void square(){}
}

class TriangleCompute implements prototype{
Scanner inp=new Scanner(System.in);
public void triangle(){
double height,breadth,hypotenuse;
System.out.println("Enter the breadth of the triangle:");
breadth=inp.nextDouble();
System.out.println("Enter the height of the triangle:");
height=inp.nextDouble();
System.out.println("Enter the hypotenuse of the triangle:");
hypotenuse=inp.nextDouble();
double triangle_area=0.5*breadth*height;
double triangle_peri=height+breadth+hypotenuse;
System.out.println("Area of triangle="+triangle_area);
System.out.println("Perimeter of triangle="+triangle_peri);
}
public void circle(){}
public void square(){}
public void rectangle(){}
}

class SquareCompute implements prototype{
Scanner inp=new Scanner(System.in);
public void square(){
double length;
System.out.println("Enter the length of the square:");
length=inp.nextDouble();
double square_area=length*length;
double square_peri=4*length;
System.out.println("Area of square="+square_area);
System.out.println("Perimeter of square="+square_peri);
}
public void triangle(){}
public void rectangle(){}
public void circle(){}
}

public class Interface{
public static void main(String args[]){
CircleCompute obj=new CircleCompute();
RectCompute obj2=new RectCompute();
TriangleCompute obj3=new TriangleCompute();
SquareCompute obj4=new SquareCompute();
Scanner inp=new Scanner(System.in);
do
{
System.out.println("\n\n\n___MENU___\n1.Area and Perimeter of Circle.\n2.Area and perimeter of rectangle.\n3.Area and perimeter of triangle\n4.Area and perimeter of square\n5.Exit");
System.out.print("Enter your choice:");
int ch = inp.nextInt();
switch (ch) {
case 1:obj.circle();
break;
case 2:obj2.rectangle();
break;
case 3:obj3.triangle();
break;
case 4:obj4.square();
break;
case 5:System.exit(0);
break;
}
}while(true);}
}
