import java.util.Scanner;
public class grade{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int mark=sc.nextInt();
    if(mark>=90){
      System.out.println("gradeA");}
    else if(mark>=75){
      System.out.println("grade B");}
    else if(mark>60){
      System.out.println("grade C");}
    else{
      System.out.println("fail");
    }
  }
}
    