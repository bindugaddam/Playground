import java.util.Scanner;
class Main {
	public static void main (String[] args) {
     Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      if(num>=1&&num<=5)
        System.out.println("Three");
      else
        System.out.println("Invalid");  
	}
}