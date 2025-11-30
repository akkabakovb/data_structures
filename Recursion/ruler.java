//Ruler Example for class on 2-20-24
//Declare program class
public class ruler{
  //This program will create an English ruler for the given number of inches
  //Put ruler togther and let user specify the interval they wants
  public static void drawRuler(int nInches, int majorLength){
    drawLine(majorLength, 0);//Draw inch 0
    for(int j=1; j<= nInches; j++){
      drawInternval(majorLength-1);//Draw the interior tick marks of the ruler
      drawLine(majorLength, j); //Draws inch j and the label
    }

  }
  //Draw Interval for our ruler
  private static void drawInternval(int centerLength){
    if(centerLength >=1){//Otherwise nothing will happen, this will be our base case
      drawLine(centerLength-1); //Recursively draw the "top" Lines
      drawLine(centerLength);//Draw the center tick mark
      drawLine(centerLength-1);//Recursively draw the "bottom" lines
    }
  }
  //Draw the ruler lines
  private static void drawLine(int tickLength, int tickLabel){
    for(int j=0; j <tickLength; j++){
      System.out.print("-");
    }
    if(tickLabel >=0){
      System.out.print(" " + tickLabel);
    }
    System.out.print("\n");
  }
  //Draw the ruler lines without labels
  private static void drawLine(int tickLength){
    drawLine(tickLength, -1);
  }
  //Program main method
  public static void main(String[] args){
    drawRuler(12,4);
  }
}
