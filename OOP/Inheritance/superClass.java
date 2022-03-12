
package OOP.Inheritance;
public class superClass
{
    public int a =20;
    public int b = 30;
    public int c;
    
    public void add()
    {
        this.c = this.a+this.b;
        System.out.println("Summation is (Super class function) : "+this.c);
    }
    
    public void sub()
    {
        this.c = this.a-this.b;
        System.out.println("Summation is (Super class function) : "+this.c);
    }
}
