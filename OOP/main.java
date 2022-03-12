/*
 Main Class For OOP
     OOP is a concept where any class is hold by a variable and
     then control the entire class using that specific variable...
 */
package OOP;

public class main 
{
    public static void main(String[]arg)
    {
        oopClass object1 = new oopClass();
        System.out.println("From oopClass and variable is a :"+object1.a);
        object1.myFunction1();
        object1.add();
    }   
}
