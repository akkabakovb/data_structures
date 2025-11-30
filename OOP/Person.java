public class Person{
  int age;
  int weight;
  double height;
  String name;
  private double heightInMeters;
  private double weightInKilos;
  double BMI;
  public Person(int a, int w, double h, String n){
    age=a;
    weight=w;
    height=h;
    name=n;
    heightInMeters=height*0.3048;
    weightInKilos=weight*0.453;
  }
  //Getter/Accessor methods
  public int getAge(){return age;}
  public int getWeight(){return weight;}
  public double getHeight(){return height;}
  public String getName(){return name;}
  public double getHeightInMeters(){return heightInMeters;}
  public double getWeightInKilos(){return weightInKilos;}
  //Setter/Update methods
  public void setAge(int a){age=a;}
  public void setHeight(double h){height=h;}
  public void setWeight(int w){weight=w;}
  public void setName(String n){name=n;}
  //Methods of methods
  
}
