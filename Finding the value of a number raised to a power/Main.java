import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int b=in.nextInt();
      int result=1;
      while(b!=0)
      {
        result=result*n;
        --b;
      }
      System.out.println(result);
    }
}