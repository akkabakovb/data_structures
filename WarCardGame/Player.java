import java.util.ArrayDeque;

public class Player{
  //Instance variables
  private ArrayDeque<Card> playerDeck = new ArrayDeque<Card>();
  //Constructor
  public Player(){
    playerDeck = new ArrayDeque<Card>();
  }
  //Methods
  public Card dealCard(){return playerDeck.removeFirst();}
  public void addCard(Card c){ playerDeck.addLast(c);}
  public String toString(){
    String sb = "";
    for(var card : playerDeck){
      sb += card.getValue() + " " + card.getSuit() + "\n";
    }
    return sb;
  }
  public int size(){
    return playerDeck.size();
  }
  }
