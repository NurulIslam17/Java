package tutorial;

public class Construtor_2 
{
        public static void main(String arg[])
       {
           B obj = new B(5,5.5);
       }
    
}
class B
{
  public B()// const with same name but different perameter is callde const overloading
  {
      System.out.println(" Constructor without parrameter");
  }
    public B(int a)
  {
      System.out.println("Constructor with parrameter");
  }
       public B(int a,double d)
  {
      System.out.println("Constructor with intDouble");
  }
   
}