import java.util.Random;
import java.util.Arrays;
public class uniqueMethods{
  public static void main(String [] args){
    Random rand= new Random();
    long startTime = System.currentTimeMillis();
    //During the experemential analysis unique1 method took 3.955 seconds with the size of an array 492830716
    //But for the size=492830717 it takes some huge amount of time
    //Eventually, for the size=493100000 the program throws OutOfMemoryError
    int size = 246415356; //the following size is the largest for the unique2 method for my memory and it takes 26.356 seconds
    // if we increment up the size by 1 the compiler will indicate OutOfMemoryError
    int[] array = new int[size];
    for(int i=0; i<size; i++){
      //the decision about randomly creating integers up to 10^8 increased probability of creating unique array
      //Similarly it decreased chance of facing similar integers in the first indexes which will lead to fast program execution
      array[i]= rand.nextInt(100000000);
    }
    System.out.println(unique2(array));
    long endTime = System.currentTimeMillis();
    long executionTime = endTime - startTime;
    System.out.println("Execution time: " + executionTime + " milliseconds");
  }
  public static boolean unique1( int[] data){ //time complexity: O(n^2)
    int n =data.length;
    for(int j=0; j<n-1; j++){
        for(int k=j+1; k<n; k++){
          if(data[j]==data[k]) return false;
        }
    }
    return true;
  }
  public static boolean unique2(int[] data){  //time complexity: O(n)
    int n = data.length;
    int[] temp = Arrays.copyOf(data, n);
    Arrays.sort(temp);
    for(int j=0; j<n-1; j++){
      if(temp[j]==temp[j+1]) return false;
    }
    return true;
  }
}
