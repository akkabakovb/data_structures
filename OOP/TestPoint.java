// Bektur Akkabakov
// Assignment 3
// Class number:01
// Instructor: Pepo Mena
// Due date: 02/01/2024
public class TestPoint{
  public static void main(String[] args){
    Point firstPoint=new Point(); //creating point object using default constructor
    Point secondPoint=new Point(5,9); //creating point object using 2-parameter constructor
    System.out.println("My first point is: "+firstPoint.getXvalue()+","+firstPoint.getYvalue()); //printing using getter methods
    System.out.println("My second point is: "+secondPoint.getXvalue()+","+secondPoint.getYvalue());
    secondPoint.setXvalue(2); //changing the values of both instance variables of secondPoint using setter methods
    secondPoint.setYvalue(2);
    System.out.println("My second point is now: "+secondPoint.getXvalue()+","+secondPoint.getYvalue());
    Square firstSquare=new Square(firstPoint,secondPoint,"My Square"); //creating square object using 3-parameter constructor
    System.out.println("The name of my square is: "+firstSquare.getName()); //printing statements using getter methods
    System.out.println("The lenght of my square is: "+firstSquare.getLenght());
    System.out.println("The height of my square is: "+firstSquare.getHeight());
    System.out.println("The area of my square is: "+firstSquare.getArea());
    System.out.println("The perimeter of my square is: "+firstSquare.getPerimeter());
    Circle firstCircle = new Circle(firstPoint, 1, "My Circle"); //creating circle object using 3-parameter constructor
    System.out.println("The name of my circle is: "+firstCircle.getName());
    System.out.println("The radius of my circle is:"+firstCircle.getRadius());
    System.out.println("The center of my circle is at: "+firstCircle.getCenterPoint().getXvalue()+","+firstCircle.getCenterPoint().getYvalue());
    System.out.println("The area of my circle is: "+firstCircle.getArea());
    System.out.println("The circumference of my circle is: "+firstCircle.getCircumference());
  }
}
