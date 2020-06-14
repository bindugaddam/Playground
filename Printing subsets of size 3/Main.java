import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in=new Scanner(System.in);
      int arr_size=in.nextInt();
      int arr[]=new int[arr_size];
      for(int i=0;i<=arr_size-1;i++)
      {
        arr[i]=in.nextInt();
      }
      subsets_of_size_3(arr_size,arr);
    }
  public static void subsets_of_size_3(int arr_size,int arr[])
  {
    for(int j=0;j<=arr_size-2;j++)
    {
      for(int k=j+1;k<=arr_size-1;k++)
      {
        for(int l=k+1;l<=arr_size-1;l++)
        {
          System.out.print("(" +arr[j]+ ","+" "+arr[k]+","+" "+arr[l]+")"+" ");
        }
      }
      System.out.println();
    }
  }
        
    }