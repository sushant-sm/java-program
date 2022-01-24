import java.util.*;
public class Que8
{
    public static void main (String[] args)
    {
        
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter number- ");
        int n= sc.nextInt();
        
        PatternPrint obj = new PatternPrint();
        obj.pattern(n, 1);
        System.out.println("Total Number of Stars = " + obj.count);
    } 
}
class PatternPrint {
    int count = 0;
    void star(int num)
    {
        if (num == 0)
            return;
        System.out.print("* ");
        count++;
        star(num - 1);
    }
   void pattern(int n, int i)
    {
        if (n == 0)
            return;
        star(i);
        System.out.println();
        pattern(n - 1, i + 1);
    }
}