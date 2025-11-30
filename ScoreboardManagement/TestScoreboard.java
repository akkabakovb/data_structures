// Bektur Akkabakov
// Assignment 5
// Class number:01
// Instructor: Pepo Mena
// Due date: 02/22/2024
import java.util.Random;
public class TestScoreboard{
  public static void main(String [] args){
  //Creating random number generator
  Random rand= new Random();
  //Creating the object of class Scoreboard
  int capacityOfScoreboard=25;
  ScoreboardSLL first_scoreboard= new ScoreboardSLL(); //ScoreboardSLL and ScoreboardDLL are the names of both linked list classes
  //Loop that files up the Scoreboard
  for(int i = 0; i < capacityOfScoreboard; i++){
      String name = "Player " +  String.valueOf(i+1);
      int score = rand.nextInt(1000);
      GameEntry gameEntry = new GameEntry(name, score);
      first_scoreboard.add(gameEntry);
  }
  //Invoking the methods of the Scoreboard class
      first_scoreboard.printScoreboard();
      first_scoreboard.getSummaryScoreboard();
      // first_scoreboard.remove(rand.nextInt(25));
      // first_scoreboard.printScoreboard();
      // first_scoreboard.getSummaryScoreboard();
}
}
