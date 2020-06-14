import java.util.Scanner;
class Main{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int rs=in.nextInt();
    int cs=in.nextInt();
    int i,j;
    int[][] m1=new int[rs][cs];
    for(i=0;i<rs;i++)
    {
      for(j=0;j<cs;j++)
      {
        m1[i][j]=in.nextInt();
      }
    }
    for(i=0;i<cs;i++)
    {
      for(j=0;j<rs;j++)
      {
        System.out.print(m1[j][i]+" ");
      }
      System.out.println();
    }    
  }
}