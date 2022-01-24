public class Que4{
    public static void main(String[] args)
    {
        String name = "Jessy";
        int age = 30;
        int contact = 999999999;
        String mem = "silver";
        int rp = 10;

        Customer obj = new Customer();
        // obj.ShowCust();

        obj.ShowCust(name,age,contact,mem,rp);
    }
}
class Customer{
    public void ShowCust(String Cust_nm, int age, int contact, String membership, int rp)
    {
        System.out.println("Cust name = "+ Cust_nm + "\n Age = " + age + "\n Contact = " + contact + "\n Membership = " + membership + "\n Reward Point = " + rp);
    }
    public void ShowCust()
    {
        System.out.println("Cust name = Sushant \n Age = 21 \n Contact = 7249306018 \n Membership = Gold \n Reward Point = 5" );
    }
}