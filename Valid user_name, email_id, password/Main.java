import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.util.*;
public class Main {
    // type your code here
  public static void main(String a[])
  {
    Scanner in = new Scanner(System.in);
    String name = in.nextLine();
    String mail = in.nextLine();
    String pass = in.nextLine();
    int nl=name.length();
    int ml=mail.length();
    int pl=pass.length();
    int nf=0;
    for(int i=0;i<nl;i++)
    {
      if(name.charAt(i)=='@' && name.charAt(i)=='#' && name.charAt(i)=='$' && name.charAt(i)=='%')
      {
        nf=1;
      }
    }
    if(nf==0)
    {
      System.out.println("Is "+name+" a valid user name? true");
    }
    else
    {
      System.out.println("Is"+name+"a valid user name? false");
    }
    nf=0;
    for(int i=0;i<ml;i++)
    {
      if(mail.charAt(i)>='A'&&mail.charAt(i)<='Z')
      {
        nf=1;
      }
    }
    if(nf==0)
    {
      System.out.println("Is "+mail+" a valid email address? true");
    }
    else
    {
      System.out.println("Is "+mail+" a valid email address? false");
    }
    nf=0;
    for(int i=0;i<pl;i++)
    {
      if(pass.charAt(i)=='*')
      {
        nf=1;
      }
    }
    if(nf==0)
    {
      System.out.print("Is "+pass+" a valid password? true");
    }
    else
    {
      System.out.print("Is "+pass+" a valid password? false");
    }
  }
}