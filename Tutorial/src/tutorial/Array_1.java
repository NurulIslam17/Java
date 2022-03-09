package tutorial;
public class Array_1
{
    public static void main(String[]arg)
    {
        int a[]=new int[5];
        
        for(int i=0;i<a.length;i++)
        {
            a[i]=i+1;
        }
         System.out.println(" Usinrg nomral forLoop");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(" "+a[i]);
        }
        System.out.println(" Usinrg enhasnced forLoop");
        for(int i : a)
        {
            System.out.println(" "+i);
        }
    }
}
