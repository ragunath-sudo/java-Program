import java.util.Scanner;
public class vote{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    if(a>=18)
      System.out.println("majar and eligible to vote");
    else
      System.out.println("minor and not eligible to vote");
  }
}