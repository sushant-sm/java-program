import java.util.*;
public class inheritance {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number - ");
        int n = sc.nextInt();

        Pattern obj = new Pattern();
        obj.print(n, 1);
    }
}
class Pattern {
    void star(int num) {
        if(num == 0)
            return;
        System.out.print("* ");
        star(num - 1);
    }
    void print(int n, int i)
    {
        if(n == 0)
            return;
        star(i);
        System.out.println();
        print(n-1, i+1);
    }
}
