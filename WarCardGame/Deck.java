import java.util.ArrayList;
import java.util.Collections;

public class Deck{
  //Instance variables
  private ArrayList<Card> deck;

  //Constructor
  public Deck(){
    deck= new ArrayList<Card>(54);
    String[] suits ={"Heart","Diamond","Club","Spade"};
    for(int i=2; i<15; i++){
      for(var suit:suits){
        Card card = new Card(i, suit);
        deck.add(card);
      }
    }
    Card card = new Card(15, "Joker");
    deck.add(card);
    deck.add(card);
  }
  //Methods
  public String toString(){
    String sb = "";
    for(var card: deck){
      sb += card.getValue()+ " " + card.getSuit() + "\n";
    }
    return sb;
  }
  public void shuffle(){
    Collections.shuffle(deck);
  }
  public int size(){
    return deck.size();
  }
  public Card dealCard(){
    if(deck.size()!=0){
      return deck.remove(0);
    }
    return null;
  }
}
