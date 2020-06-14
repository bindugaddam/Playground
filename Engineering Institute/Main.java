import java.util.Scanner; 

class Faculty
{
  public void salary(int basesalary)
  {
    //write your Faculty class statements
    System.out.println("Base Salary: " + basesalary); 
  }
}
class CSE extends Faculty
{
  public void salary(int amt)
  {
    //write your CSE class statements
    int result=amt+3000;
    System.out.println("CSE Faculty: "+result);
  }
}
class IT extends Faculty
{
  public void salary(int amt)
  {
    //write your IT class statements
    int result=amt+5000;
    System.out.println("IT Faculty: "+result);
  }
}
class ECE extends Faculty
{
  public void salary(int amt)
  {
    //write your ECE class statements
    int result=amt+4500;
    System.out.println("ECE Faculty: "+result);
  }
}
class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int basesalary = in.nextInt();
    Faculty ss=new Faculty();
    ss.salary(basesalary);
    CSE bn=new CSE();
    bn.salary(basesalary);
    //implement your required concept here
    IT bin=new IT();
    bin.salary(basesalary);
     ECE obj = new ECE();
    obj.salary(basesalary);
  }
}