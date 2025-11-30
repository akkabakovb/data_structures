// Bektur Akkabakov
// Midproject
// Class number:01
// Instructor: Pepo Mena
// Due date: 03/28/2024
import java.util.ArrayDeque;
import java.util.Random;

public class War{
  //Instance variables
  ArrayDeque<Card> round_deck = new ArrayDeque<Card>();
  Player Player_1 = new Player();
  Player Player_2 = new Player();
  boolean isWar=false;
  int round_count = 0;
  int war_count = 0;
  //Constructor
  public War(){
    intialize();
    while(!isWinGame()){
      Card temp1 = new Card();
      temp1 = Player_1.dealCard();
      Card temp2 = new Card();
      temp2 = Player_2.dealCard();
      addingOrder(temp1, temp2);
     System.out.println("The first Player's card is:" + temp1.getValue()+ " " + temp1.getSuit());
     System.out.println("The second Player's card is:" + temp2.getValue()+ " " + temp2.getSuit());
      if(isFirstRound(temp1,temp2)){
        firstWonRound(temp1, temp2);
        round_count++;
}
      else if (isSecondRound(temp1,temp2)){
        secondWonRound(temp1, temp2);
        round_count++;
}
      else if (isWar(temp1,temp2)){
        isWar=true;
        war_count++;
      }
      }
   System.out.println("The number of the rounds in a game is: "+round_count);
    if(firstWonGame()){
      System.out.println("Player 1 won the game!");
  }
    else{
      System.out.println("Player 2 won the game!");
  }
  }

  //Methods
  protected void intialize(){
    Deck myDeck= new Deck();
    myDeck.shuffle();
    System.out.println(myDeck.toString());
    System.out.println(myDeck.size());
    for(int i=0; i<27; i++){
      Player_1.addCard(myDeck.dealCard());
      Player_2.addCard(myDeck.dealCard());
    }
    System.out.println(myDeck.size());
    System.out.println(Player_1.size());
    System.out.println(Player_2.size());
    }

  protected boolean isWinGame(){return Player_1.size()==54 || Player_2.size()==54 ||  Player_1.size()==0 ||  Player_2.size()==0;}
  protected boolean firstWonGame(){return Player_1.size()==54 || Player_2.size()==0;}
  protected boolean secondWonGame(){return Player_2.size()==54 || Player_1.size()==0;}
  protected boolean isFirstRound(Card temp1, Card temp2){return temp1.getValue()>temp2.getValue();}
  protected boolean isSecondRound(Card temp1, Card temp2){return temp1.getValue()<temp2.getValue();}
  protected boolean isWar(Card temp1, Card temp2){return temp1.getValue()==temp2.getValue();}

  public int getNumRounds(){return round_count;}
  public int getNumWars(){return war_count;}

  protected void addingOrder(Card temp1, Card temp2){
    Random rand = new Random();
    if(rand.nextInt()%2 == 0){
      round_deck.addLast(temp1);
      round_deck.addLast(temp2);
      }
    else {
      round_deck.addLast(temp2);
      round_deck.addLast(temp1);
      }
    }
  protected void firstWonRound(Card temp1, Card temp2){
    while(!round_deck.isEmpty()){
      Player_1.addCard(round_deck.getFirst());
      round_deck.removeFirst();
    }
    if(isWar){
      System.out.println("Player 1 has won this war");
      isWar=false;
    }
    else{
      System.out.println("Player 1 has won this round");
    }
    roundSummary();
  }
  protected void secondWonRound(Card temp1, Card temp2){
    while(!round_deck.isEmpty()){
      Player_2.addCard(round_deck.getFirst());
      round_deck.removeFirst();
    }
    if(isWar){
      System.out.println("Player 2 has won this war");
      isWar=false;
    }
    else{
      System.out.println("Player 2 has won this round");
    }    roundSummary();
  }
  protected void roundSummary(){
    System.out.println("Player 1 has left " + Player_1.size() + " cards.");
    System.out.println("Player 2 has left " + Player_2.size() + " cards.");
  }
  public static void main(String[] args){
    War wargame = new War();

  }
}
