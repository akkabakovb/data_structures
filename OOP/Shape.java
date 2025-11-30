public class Shape{
  protected String name;  // protected instance variable
  public Shape(String name){ // single parameter constructor
    this.name=name;
  }
  // Access/Getter methods
  public String getName(){return name;}
  // Edit/Setter methods
  public void setName(String name){this.name=name;}
}
