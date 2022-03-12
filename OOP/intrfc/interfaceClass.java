/*
 Basically interface is created in the program as a blu print of 
different merthod 
 */
package OOP.intrfc;

interface first {
    void firstMethod(); // no method body
}

interface secnd {
    void secndMethod();
}

interface third {
    void thirdMethod();
}

public class interfaceClass implements first {
  @Override
  public void firstMethod()
  {
    System.out.println("FRom first interface method") ; 
  }
  public void secndMethod()
  {
      System.out.println("FRom second interface method") ;
  }
  public void thirdMethod()
  {
      System.out.println("FRom third interface method") ;
  }
}
