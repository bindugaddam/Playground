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
}