public class Circle extends Shape{ //creating subclass for the Shape class
  protected Point centerPoint=new Point(); //creating protected Point instance variable
  protected int radius; //creating protected radius instance variable
  public Circle(Point centerPoint,int radius, String name){ //3-parameter constructor which passes Point object, the radius and the name
    super(name); //call the constructor of the superclass
    this.centerPoint=centerPoint;
    this.radius=radius;
  }
  //Access/Getter methods
  public int getRadius(){return radius;}
  public Point getCenterPoint(){return centerPoint;}
  public double getArea(){return Math.pow((double)getRadius(),2.0)*3.14;} //calculates the area of a circle
  public double getCircumference(){return 2*3.14*getRadius();} //calculates the circumference of a circle
}
