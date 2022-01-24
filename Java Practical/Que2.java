import java.util.*;
public class Que2 {
    public static void main(String argc[])
    {
        int n, sum = 0, a;
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter number- ");
        n= sc.nextInt();
        while (n > 0 || sum > 9) 
        {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            a = n % 10;
            // System.out.println(a);
            sum = sum + a;
            n = n /10;
            // System.out.println(n);
        }
        System.out.println("Sum = "+ sum);
    }

}