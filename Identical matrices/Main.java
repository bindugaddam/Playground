import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int rs = in.nextInt();
    int cs = in.nextInt();
    int[][] arr = new int[rs][cs];
    int[][] arr1 = new int[rs][cs];
    int i,j;
    for(i=0;i<rs;i++)
    {
      for(j=0;j<cs;j++)
      {
        arr[i][j]=in.nextInt();
      }
    }
    for(i=0;i<rs;i++)
    {
      for(j=0;j<cs;j++)
      {
        arr1[i][j]=in.nextInt();
      }
    }
    int c=0;
    for(i=0;i<rs;i++)
    {
      for(j=0;j<cs;j++)
      {
        if(arr[i][j]!=arr1[i][j])
        {
          c=1;
        }
      }
    }
    if(c==0)
      System.out.print("Yes");
    else
      System.out.print("No");
      }
    }