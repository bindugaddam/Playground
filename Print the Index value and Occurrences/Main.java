import java.util.*;
import java.util.regex.*;
import java.io.*;
public class Main {

    public static void main(String[] args) 
    {
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      String str1 = in.nextLine();
      Pattern pattern = Pattern.compile(str);  
      Matcher m = pattern.matcher(str1); 
      int i=0;
    while (m.find())
    {
      i++;
      System.out.println("found: "+ i +" : "+ m.start() +" - " + (m.end())); 
    }
      String[] arr = str1.split(" ");
      int c = 0;
      for(i=0;i<arr.length;i++)
      {
        if(str.equals(arr[i]))
        {
          c++;
        }
      }
      if(c==0)
      {
        System.out.print("The given word is not present in the string");
      }
      else
      {
        System.out.print(c);
      }
    }
}