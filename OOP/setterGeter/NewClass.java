/*
        Setter and Getter is a technique is used to access privte variable to other class
        // to get variable
        // to set variable...
 */
package OOP.setterGeter;

public class NewClass 
{
    public String name = "Nurul Islam";
    private String school = "GUB"; // to access this getter method need
    
    public String area;
    private String city;
    
    // getter method
    public String A()
    {
        return school;
    }
    
    // to set private variables vale setter method is nedded
    
    public String B(String v)
    {
        this.city = v;
        System.out.println(this.city);
        return null;
    }
}
