import java.util.Random;
import java.util.Comparator;
public class Order implements Comparable<Order>{
  //Instance variables
  protected String name = "Order_";
  protected int priority;
  protected int value;
  protected int length;
  Random rand = new Random();
  private Comparator<Order> comp;
  //Constructor
  public Order(int Order_num){
  priority=rand.nextInt(20)+1;
  name+=String.valueOf(Order_num);
  length=rand.nextInt(40)+10;
  value=length*25000;
  }
  public Order(int Order_num, boolean isRush, boolean isDiscount){
    if(isRush&&!isDiscount){
      priority=1;
      value=3*length*25000;
    }
    else if(!isRush&&isDiscount){
      value=10000*length;
      priority=rand.nextInt(20)+1;
    }
    else{
      priority=20;
      value=length*25000;
    }
  name+=String.valueOf(Order_num);
  length=rand.nextInt(40)+10;
  }
  //Getter/Accessor methods
  public String getName(){return name;}
  public int getPriority(){return priority;}
  public int getValue(){return value;}
  public int getLength(){return length;}
  //Setter/Update methods
  public void setLength(int length){this.length=length;}

  public int compareTo(Order ord){
    if(this.getPriority()>ord.getPriority()){return 1;}
    else if(this.getPriority()<ord.getPriority()){return -1;}
    else {return 0;}
  }
}
