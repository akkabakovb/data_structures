import java.lang.Math;
public class Square extends Shape{ //creating subclass for the Shape class
  protected Point firstPoint=new Point(); //creating protected Point instance variables
  protected Point secondPoint=new Point();
  public Square(Point firstPoint,Point secondPoint, String name){ //3-parameter constructor which passes 2 Point objects and the name
    super(name); //call the constructor of the superclass
    this.firstPoint=firstPoint;
    this.secondPoint=secondPoint;
  }
  //Getter/Access methods
  public int getLenght(){ //calculates the lenght of a square
    return Math.abs(firstPoint.getXvalue()-secondPoint.getXvalue());
  }
  public int getHeight(){ //calculates the height of a square
    return Math.abs(firstPoint.getYvalue()-secondPoint.getYvalue());
  }
  public int getArea(){ //calculates the area of a square
    return getHeight()*getLenght();
  }
  public int getPerimeter(){  //calculates the perimeter of a square
    return 2*(getHeight()+getLenght());
  }
}
