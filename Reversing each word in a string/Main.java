import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String blogName=in.nextLine();
    StringBuilder reverseString = new StringBuilder();
    String[] words = blogName.split(" ");       
    for (String word : words)
      {
         String reverseWord = new StringBuilder(word).reverse().toString();      
         reverseString.append(reverseWord + " ");                                
      }
    System.out.println( reverseString); 
  }
}