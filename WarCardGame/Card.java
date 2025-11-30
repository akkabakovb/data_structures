public class Card{
//Instance variables
  String suit;
  int value;
//Constructor
  public Card(int value, String suit){
    this.value=value;
    this.suit=suit;
  }
  public Card(){
  }
 //Getter Methods
 public int getValue(){return value;}
 public String getSuit(){return suit;}
}
