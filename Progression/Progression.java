public class Progression{
  protected long current;
  public Progression(long start){
    current=start;
  }
  public Progression(){
    this(0);
  }
  protected void advance(){
    current++;
  }
  public long nextValue(){
    long answer=current;
    advance();
    return answer;
  }
  public void printProgression(int n){
    for(int i=0;i<n;i++){
      System.out.println(" "+nextValue());
    }
    System.out.println();
  }
}
