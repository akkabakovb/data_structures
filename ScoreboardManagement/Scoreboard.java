public class Scoreboard{
  //Instance variables
  private GameEntry[] board;
  int numEntries=0;

  //Constructor
  public Scoreboard(int capacity){
    board = new GameEntry[capacity];
  }
  //Methods
  //Adding GameEntry into the board
  public void add(GameEntry e){
    int newScore = e.getScore();

    if (numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
      if(numEntries<board.length){
        numEntries++;
     }
     int j = numEntries-1;
     while (j>0 && board[j-1].getScore() < newScore){
       board[j]=board[j-1];
       j--;
     }
     board[j]=e;
    }
  }
public int getSize(){return board.length;}
  //Remove a GameEntry from the board

  public GameEntry remove(int i) throws IndexOutOfBoundsException{
  if( i<0 || i>=numEntries) throw new IndexOutOfBoundsException("Invalid index: "+i);
    GameEntry temp=board[i];
  for(int j=i;j<numEntries-1;j++){
    board[j]=board[j+1];
    }
    board[numEntries-1]=null;
    numEntries--;
    return temp;
}
  //Printing out all game entries of the Scoreboard

  public void printScoreboard(){
  for(int k=0; k<numEntries; k++){
    System.out.println(board[k].toString());
  }}
  //Calculates the average of the scores inside the Scoreboard
  public double getTheAvgScoreboard(){
    int sum=0;
    for(int i=0; i<numEntries; i++){
      sum+=board[i].getScore();
    }
    return sum/numEntries;
  }
  //Calculates the range of the scores inside the Scoreboard
  public double getTheRangeScoreboard(){
    return board[0].getScore()-board[numEntries-1].getScore();
  }
  //Get the summary of the Scoreboard
  public void getSummaryScoreboard(){
    System.out.println("The number of game entries inside the scoreboard is: " + numEntries);
    System.out.println("The highest score in the scoreboard is: " + board[0].getScore());
    System.out.println("The lowest score in the scoreboard is: " + board[numEntries-1].getScore());
    System.out.println("The range of the score in the scoreboard is: " + getTheRangeScoreboard());
    System.out.println("The average score in the scoreboard is: " + getTheAvgScoreboard());
  }
}
