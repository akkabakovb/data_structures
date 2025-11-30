public class Point{
  protected int x; // protected instance variables
  protected int y;
  public Point(){ // default constructor
    x=0;
    y=0;
  }
  public Point(int x, int y){ // 2-parameter constructor
    this.x=x;
    this.y=y;
  }
  // Access/Getter methods
  public int getXvalue(){return x;}
  public int getYvalue(){return y;}
  // Edit/Setter methods
  public void setXvalue(int x){this.x=x;}
  public void setYvalue(int y){this.y=y;}
}
