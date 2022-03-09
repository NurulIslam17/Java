package tutorial;
/**
    Constructor....method with same class name
 */
public class Constructor_1 
{
       public static void main(String arg[])
       {
           A obj = new A();
         //  obj.A(); //no need to call its automaticly called
       }
}
class A
{// default constructor
  public A() // method name is same with the class name and no return type
  {
      System.out.println("In A Cnstructor");
  }
}
