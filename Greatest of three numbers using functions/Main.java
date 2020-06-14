import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      System.out.print(largestnumber(n1,n2,n3));
    }
      public static int largestnumber(int n1,int n2,int n3)
      {
        int largest=0;
        if(n1>n2&&n1>n3)
          largest=n1;
        else if(n2>n1&&n2>n3)
        largest=n2;
        else
          largest=n3;
      return largest;
	}
}