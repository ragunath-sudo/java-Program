import java.util.Scanner;
public class pass{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int mark=sc.nextInt();
    if(mark>=40){
      System.out.println("pass");}
    else{
      System.out.print("fail");}
  }
}