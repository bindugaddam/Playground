import java.util.Scanner;
class Main
{
	public static int square(int m)
    {
      int n=0;
      n=m*m;
      return n;
    }
   public static void main(String args[])
  {
     Scanner in=new Scanner (System.in);
    int n1=in.nextInt();
    if(n1>0)
    {
      int sl=square(n1);
      n1=sl;
    }
    System.out.println(n1);
  }
}