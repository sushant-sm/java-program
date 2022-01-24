class Que5
{
   public static void main (String args[])
   {
	 int count = 0, n = 1, sum = 0;
	 while(n<=15)
	 {
		 count = 0;
		 int i = 2;

	 while (i<=n/2)
	 {
		 if (n%i==0)
		 {
			 count++;
			 break;
		 }
		 i++;
	 }
	 if (count == 0 && n!=1)
	 {
		 sum = sum + n;
	 }
	 n++;
   }
    System.out.println("sum = " +sum);
  }
}