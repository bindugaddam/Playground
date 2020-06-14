import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int rs = in.nextInt();
    int cs = in.nextInt();
    int i,j,k;
    int[][] arr = new int[rs][cs];
    int[][] ans = new int[rs][cs];
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
         if(i==j)
         System.out.print(arr[i][i]+" ");
      }
    }
    int c; 
    for(i=0;i<rs;i++)
    {
      c=0;
      for(j=0;j<cs;j++)
      {
         if(j>i&&c==0)
         {
           System.out.print(arr[i][j]+" ");
           c++;
         }
      }
    }
    if(rs>2)
    {
    for(i=0;i<rs;i++)
    {
      for(j=0;j<cs;j++)
      {
         if(j==rs-1&&i==0)
         {
           System.out.print(arr[i][j]+" ");
         }
      }
    }
    }
  }
}