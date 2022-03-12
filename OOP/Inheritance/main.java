/*
  Inheritance is a technique where -
   >> any subclass can access the behaviour of the super class
   >> new behaviour can add (super class)
 */
package OOP.Inheritance;
public class main 
{
    public static void main(String[]arg)
    {
        subClass handler = new subClass();
        handler.add();
        handler.sub();
    }
}
