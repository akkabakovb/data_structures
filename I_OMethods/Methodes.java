import java.util.Scanner;
public class Methodes{
  public static void returnTheValue(int n){
    System.out.println(n);
  }
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n;
    n=input.nextInt();
    returnTheValue(n);
  }}
