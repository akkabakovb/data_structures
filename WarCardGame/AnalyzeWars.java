// Bektur Akkabakov
// Midproject
// Class number:01
// Instructor: Pepo Mena
// Due date: 03/28/2024
public class AnalyzeWars{
  public static void main(String[] args){
    int count_first=0;
    int count_second=0;
    int round_count=0;
    int war_count=0;
    double num_game=1000;
    for(int i=0; i<num_game; i++){
      War wargame = new War();
      if(wargame.firstWonGame()){count_first++;}
      else{count_second++;}
      round_count+=wargame.getNumRounds();
      war_count+=wargame.getNumWars();
    }
    double avg_r = round_count / num_game;
    double avg_w = war_count / num_game;
    System.out.println("The first player won " + count_first + " times.");
    System.out.println("The second player won " + count_second + " times.");
    System.out.println("The average number of rounds is: " + avg_r);
    System.out.println("The average number of wars is: " + avg_w);
  }
}
