import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum=0;
      int temp=n;
      while(n>0)
      {
        int i=1;
        int f=1;
        int r=n%10;
        while(i<=r)
        {
          f=f*i;
          i++;
        }
        sum=sum+f;
        n=n/10;
      }
      if(sum==temp)
        System.out.println("Yes");
      else
        System.out.println("No");
      
	}
}