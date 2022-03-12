/*
  Java can not performs multitask.. for that we need thread class
  >> Two away :
        1. Thread by inheritance
        2. Thread by interface
   >> Every process is independence
*/
package OOP.Thread;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Thread_By_Inheritance 
{
    public static void main(String[]arg)
    {
      A_proc obj = new A_proc();
      B_proc obj1 = new B_proc();
      obj.start();
      obj1.start();
    }
}

class A_proc extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            try {
                System.out.println("A Process Completed successfully");
                sleep(700);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread_By_Inheritance.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
 class B_proc extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            try {
                System.out.println("B Process Completed successfully");
                sleep(700);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread_By_Inheritance.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}