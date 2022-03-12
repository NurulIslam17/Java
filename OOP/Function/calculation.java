
package OOP.Function;

public class calculation 
{
    public void add() // function with out perameter
    {
        int a=20;
        int b=23;
        int c=a+b;
        System.out.println("Summation is : "+c);
    }
    public void addPera(int a, int b) // function with  perameter
    {
        int c=a+b;
        System.out.println("Summation is(perameter) : "+c);
    }
    // multiplication
     public void mult(int a, int b)
    {
        int c=a*b;
        System.out.println("Multiplication is : "+c);
    }
}
