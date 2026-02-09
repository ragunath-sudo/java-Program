import java.util.Scanner;
public class greater{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    if(a>b)
      System.out.println("a is greatest than b");
    else if(a<b)
      System.out.println("b is greatest than a");
    else
      System.out.println("both are equal");
  }
}