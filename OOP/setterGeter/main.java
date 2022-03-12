
package OOP.setterGeter;

public class main 
{
    public static void main(String[]arg)
    {
        NewClass obj = new NewClass();
        System.out.println(obj.name);
        System.out.println(obj.A());
        
        // setter method
        obj.area="Mirpur";
        System.out.println(obj.area);
        
        obj.B("Dhaka");
    }
}
