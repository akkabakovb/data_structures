import java.util.PriorityQueue;
import java.util.Random;
public class Simulation{
  protected int num_ord;
  protected int revenue=0;
  protected Random rand = new Random();
  protected int day=0;
  protected boolean isRush=false;
  protected boolean isNewOrder = false;
  protected PriorityQueue<Order> queue = new PriorityQueue<Order>();
  protected int num_rush=0;
  protected boolean isDiscount=false;
  protected int num_discount=0;
//Default Constructor
  public Simulation(){
  }
//Getter/Accessor methods
  int getDay(){return day;}
  int getRevenue(){return revenue;}
  int getNumOrder(){return num_ord;}
  int getNumRushOrd(){return num_rush;}
  int getNumDiscOrd(){return num_discount;}
//Methods
//filling priotiy qeueu with 10 orders
  void populatingPQ(){
    for(num_ord=0; num_ord<10; num_ord++){
      Order demo_order= new Order(num_ord+1);
      queue.add(demo_order);
    }
  }
//every 50 days create new order which is either rush or not
  void checkNewOrder(){
    if(day%50==0){
      if(rand.nextInt()%2==0){
        isRush=true;
        num_rush++;
      }
      isNewOrder = true;
    }
  }
//adding the order into priority queue
  void addNewOrder(){
    if(isNewOrder){
      num_ord++;
      Order temp = new Order(num_ord, isRush, isDiscount);
      queue.add(temp);
      isNewOrder=false;
    }
  }
//adding discounted order if the queue is empty
  void discountOrder(){
    Order discount_temp = new Order(num_ord, isRush, isDiscount);
    queue.add(discount_temp);
    isDiscount=false;
    num_ord++;
  }
//processing the order
  void processingOrder(){
    if(queue.isEmpty()){
      this.discountOrder();
      isDiscount=true;
      num_discount++;
    }
    while(queue.peek().getLength()>1 && day!=730){
      queue.peek().setLength(queue.peek().getLength()-1);
      day++;
      System.out.println("The day: "+day+"\n"+"The order "+queue.peek().getName()+" with priority " +queue.peek().getPriority()+ " is being produced.\n" +"The number of days left to finish the order: "+ queue.peek().getLength());
      this.checkNewOrder();
    }
    revenue+=queue.poll().getValue();
    this.addNewOrder();
  }
//printing the summary of the work after 2 years
  void printingSummary(){
    System.out.println("The total revenue is: " + this.getRevenue());
    System.out.println("The total number of started orders is: " + this.getNumOrder());
    System.out.println("The total number of started rush orders is: " + this.getNumRushOrd());
    System.out.println("The total number of started discounted orders is: " + this.getNumDiscOrd());
  }
  public static void main(String[] args){
    Simulation queue = new Simulation();
    queue.populatingPQ();
    while(queue.getDay()!=730){
      queue.processingOrder();
    }
    queue.printingSummary();
  }
  }
