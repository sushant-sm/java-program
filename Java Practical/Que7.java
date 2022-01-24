public class Que7 {
    public static void main(String args[])
    {
        CalArea obj = new CalArea();
        System.out.println(obj.area(10));
        // System.out.println(obj.area(5,2));
    }
}
class CalArea {
    
    public int area(int a)
    {
        return a*a;
    }
    public int area(int length, int width)
    {
        return length*width;
    }
}
