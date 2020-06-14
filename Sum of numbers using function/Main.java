import java.util.Scanner;
class Main{
	public static int sum_of_digits(int m)
    {
      int i,sum=0;
      for(i=1;i<=m;i++)
      {
        sum=sum+i;
      }
      return sum;
    }
  public static void main(String[] args)
  {
    Scanner in=new Scanner (System.in);
    int n1=in.nextInt();
    if(n1>0)
    {
      int sod=sum_of_digits(n1);
      n1=sod;
    }
    System.out.print(n1);
  }	
}