
package OOP.Constructor;

public class NewClass 
{
    NewClass(int a)
    {
        // no need to create object seperately....
        System.out.println("This is from constructor method");
        System.out.println("Constructor method perameter : "+a);
    }
    public void normanMethod()
    {
        // need to create object in main class to call
        System.out.println("This is from Normal Method");
    }
}
