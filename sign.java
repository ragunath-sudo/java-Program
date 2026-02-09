import java.util.Scanner;
public class sign{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    if(a>0)
      System.out.println("it is positive");
    else if(a==0)
      System.out.println("it is zero");
    else
      System.out.println("it is negative");
  }
}
    
      
  