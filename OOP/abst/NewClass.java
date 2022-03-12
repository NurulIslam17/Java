/*
        abstract == which does not have real existance 
 */
package OOP.abst;

abstract class NewClass 
{
    void meth()
    {
        System.out.println("From Abstrac Class");
    }
    abstract void newMeth(); // abstract method dose not have a body

    // abstract class can contain both abstract and non abstract method
}
class Help extends NewClass 
{
    @Override
    void newMeth()
    {
        System.out.println("Abstract Method");
    }
}
