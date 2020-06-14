import java.io.*;
class Fibonacci extends Thread
{
     public void run() 
     {
     }
}
class Main
{
     public static void main(String[] args) throws IOException
     {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());
       System.out.println("Enter the limit for Fibonacci: "+n);
       if(n<0)
       {
         System.out.print("Exception occurred");
       }
       else
       {
       Fibonacci fibonacci = new Fibonacci();
       fibonacci.start();
       int[] arr = new int[10];
       arr[0]=0;
       arr[1]=1;
       for(int i=2;i<n;i++)
       {
         arr[i]=arr[i-1]+arr[i-2];
       }
       System.out.print("The Fibonacci series is :");
       for(int i=0;i<n;i++)
       System.out.print(arr[i]+" ");
       }
     }
}