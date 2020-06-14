import java.util.Scanner;
class Main{
  public static void main(String args[]) 
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int key = in.nextInt();
    int sl = str.length();
    int i;
    for(i=0;i<sl;i++)
    {
      char ch = str.charAt(i);
      if(ch>='a'&&ch<'a'+key)
      {
        int g=key-(ch-'a');
        int z='z'-(g-1);
        System.out.print((char)(z));
      }
      else if(ch!=' ')
      {
      int ch1 = (ch-key);
      System.out.print((char)(ch1));
      }
      else
        System.out.print(' ');
    }
  }
}