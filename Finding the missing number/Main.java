import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<=n-1;i++)
      {
        arr[i]=sc.nextInt();
      }
      int missing_val=0;
      for(int val=1;val<=n;val++)
      {
        boolean is_found=false;
        for(int j=0;j<=n-1;j++)
        {
          if(arr[j]==val)
          {
            is_found=true;
            break;
          }
        }     
        if(is_found==false)
        {
          missing_val=val;
          break;}
      }
      System.out.print(missing_val);
      
          
          
    }
}