public class GameEntry implements Cloneable {
  //Instance variables
  String name;
  int score;

  //Constructor
  public GameEntry(String name, int score){
    this.name=name;
    this.score=score;
  }
  //Accessor/Getter methods
  public String getName(){return name;}
  public int getScore(){return score;}

  public String toString(){return "(" + name + "," + score + ")";}
}
