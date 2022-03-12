
package OOP.instanceVariable;

public class main
{
    public static void main(String[]arg)
    {
        instance classHolder = new instance();
        classHolder.add();
        
        // Static variable or class
        
        System.out.println("Static var : "+staticVar.name);
        staticVar.function();
    }
}
