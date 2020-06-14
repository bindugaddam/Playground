import java.util.*;
public class Main
{
    static <T> void display (T element)
    {
        System.out.println("Integer Value: " + element);
    }
    static <T> void display1 (T element)
    {
        System.out.println("String Value: " + element);
    }
    static <T> void display2 (T element)
    {
        System.out.println("Float value: " + element);
    }  
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        display(a);
        String b = in.next();
        display1(b);
        float c = in.nextFloat();
        display2(c);
    }
}