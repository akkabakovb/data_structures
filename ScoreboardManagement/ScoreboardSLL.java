public class ScoreboardSLL{
  // The board constructed using SinglyLinkedList
  //Instance variables
  private SinglyLinkedList<GameEntry> board = new SinglyLinkedList<>();
  //Constructor
  public ScoreboardSLL(){}
  //Methods
  //Adding GameEntry into the board
  public void add(GameEntry e){board.addLast(e);}
  //Returning the size of the Scoreboard
  public int getSize(){return board.getSize();}
  //Remove the first GameEntry from the board
  public void remove(){
    board.removeFirst();
  }
  //Printing out all game entries of the Scoreboard
  public void printScoreboard(){
      for(int i=0;i<getSize();i++){
        board.addLast(board.first());
        System.out.println(board.first().toString());
        board.removeFirst();
    }
  }

  //Returns the lowest score inside the Scoreboard
  public int getLowScoreboard(){
      int min=board.first().getScore();
        for(int i=0; i<getSize(); i++){
          board.addLast(board.first());
            if(board.first().getScore()<min){
              min=board.first().getScore();
            }
            board.removeFirst();
          }
          return min;
  }
  //Returns the highest score inside the Scoreboard
  public int getHighScoreboard(){
        int max=board.first().getScore();
        for(int i=0; i<getSize(); i++){
          board.addLast(board.first());
            if(board.first().getScore()>max){
              max=board.first().getScore();
            }
            else{}
            board.removeFirst();
          }
          return max;
  }
    //Calculates the average of the scores inside the Scoreboard
  public double getTheAvgScoreboard(){
        int sum=0;
        for(int i=0; i<getSize(); i++){
            board.addLast(board.first());
            sum+=board.first().getScore();
            board.removeFirst();
          }
          return sum/getSize();
}
  //Calculates the range of the scores inside the Scoreboard
  public double getTheRangeScoreboard(){
    return getHighScoreboard()-getLowScoreboard();
  }
  //Get the summary of the Scoreboard
  public void getSummaryScoreboard(){
    System.out.println("The number of game entries inside the scoreboard is: " + getSize());
    System.out.println("The highest score in the scoreboard is: " + getHighScoreboard());
    System.out.println("The lowest score in the scoreboard is: " + getLowScoreboard());
    System.out.println("The range of the score in the scoreboard is: " + getTheRangeScoreboard());
    System.out.println("The average score in the scoreboard is: " + getTheAvgScoreboard());
  }
}
