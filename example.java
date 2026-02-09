import java.util.Scanner;
public class example{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String name=sc.next();
    System.out.println("welcome to java "+name);
    int a=sc.nextInt();
    System.out.println("Age is "+a);
    int b=4;
    int c=5;
    int d=b+c;
    int e=b-c;
    int f=b*c;
    int g=b%c;
    System.out.println("sum: "+d);
    System.out.println("sub: "+e);
    System.out.println("multiplication "+f);
    System.out.println("division "+g);      
  }
}  