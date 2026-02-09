import java.util.Scanner;
public class character{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    char a=s.next();
    if(a=='a'||a=='e'||a='i'||a=='o'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
      System.out.println("it is vowel");}
    else{
      System.out.println("it is consonant");}
  }
}
      
      