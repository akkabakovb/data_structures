//Importing neccessary libraries
import java.util.Hashtable;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Frequency_Counter{
  //main method throws the excepion if the program cannot find the file
  public static void main(String[] args) throws FileNotFoundException{
    try{
      Hashtable<String, Integer> myHashTable = new Hashtable<String, Integer>();
      File fileText = new File("C:/Users//HP//source//Jobs2.txt");
      Scanner text = new Scanner(fileText);
      //Treating all punctuation and special characters as delimeter
      //Want to mention that the program cannot exclude apostrophees " ' " from the words
      text.useDelimiter("[.,:;()?!\" \t\n\r-']+");
      //Populating the hashtable with the entries of word-key and frequency number-value
      while(text.hasNext()){
        //Have tried to replace the apostrophee same no luck
        String word = text.next().toLowerCase().replaceAll("'","");
        //if-condition considers the case the word is already in the table
        if(myHashTable.containsKey(word)){
          int i = myHashTable.get(word)+1;
          myHashTable.replace(word, i);
          count++
        }
        //first appearance of the word
        else{
          myHashTable.put(word, 1);
          count++;
        }
      }
      //Printing out the content of the table using for-each loop
      for (String key : myHashTable.keySet()) {
           int value = myHashTable.get(key);
           System.out.println("<"+key+">" + ":" +"<"+ value+">");
       }
       System.out.println("Word count:"+myHashTable.size());
}
    catch (FileNotFoundException e){
      throw e;
    }
  }
}
