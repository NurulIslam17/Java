
package OOP.Inheritance;
public class subClass extends superClass
{
    
    @Override
    public void sub()
    {
        this.c = this.a *this.b;
        System.out.println("Multiplication is (Super class function) : "+this.c);
    }
    
    // same method but behaviaur changes.....
}
 