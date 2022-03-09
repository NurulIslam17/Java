package tutorial;
import java.util.Scanner;

public class IfElseIf 
{
    public static void main(String[]arg)
    {
      int age;
      System.out.print("Enter the age of a person : ");
      Scanner a=new Scanner(System.in);
      age=a.nextInt();
      
      if(age<18)
      {
      System.out.println("Person is Younger");
      }
      else if(age>=18 && age<65)
      {
          System.out.println("Person is Adult");     
      }
      else if(age>=65 && age<150)
      {
         System.out.println("Person is older"); 
      } 
      else
      {
          System.out.println("Person is unbron or a legend");
      } 
    }   
}
