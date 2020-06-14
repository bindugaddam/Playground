import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner in = new Scanner(System.in);
    int rs=in.nextInt();
    int cs=in.nextInt();
    int[][] m1=new int[rs][cs];
    int[][] m2=new int[rs][cs];
    int[][] sub=new int[rs][cs];
    int i,j;
    for(i=0;i<rs;i++)
    {
      for(j=0;j<cs;j++)
      {
        m1[i][j]=in.nextInt();
      }
    }
    for(i=0;i<rs;i++)
    {
      for(j=0;j<cs;j++)
      {
        m2[i][j]=in.nextInt();
      }
    }
    for(i=0;i<rs;i++)
    {
      for(j=0;j<cs;j++)
      {
        sub[i][j]=m1[i][j]-m2[i][j];
        System.out.print(sub[i][j]+" ");
      }
      System.out.println();
    }    
  }
}