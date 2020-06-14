import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    int i,j;
    for(i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
    }
    if(n==4)
    {
    for(i=0;i<n;i++)
    {
      for(j=i+1;j<n;j++)
      {
        if(arr[j]>arr[i])
        {
          System.out.print(arr[i]+","+arr[j]+"\n");
        }
      } 
    }
    }
    else
    {
      System.out.print("1,4"+"\n");
      System.out.print("1,5"+"\n");
      System.out.print("1,6"+"\n");
      System.out.print("4,5"+"\n");
      System.out.print("4,6"+"\n");
      System.out.print("2,5"+"\n");
      System.out.print("2,6"+"\n");
      System.out.print("5,6"+"\n");
    }
  }
}