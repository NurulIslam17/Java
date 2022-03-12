
package OOP.instanceVariable;
public class instance
{
    int a=10;
    int b=20;
    int c;
    // here a, b and c is instance variable
    // to access a,b or c inside any function this.variableName is used
    // instance variable can access throug the object of this class
    
    public void add()
    {
        int d=34; // d is local variable it can only use in this local function
        this.c = this.a +this.b;
        System.out.println(" Summation is : "+this.c);
    }
//    public void localVar()
//    {
//        System.out.println("Local Variable for add() is :"+d);
//    }
//    // show code error 
    
    
}
