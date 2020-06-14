import java.util.Scanner;
class Item
{
  private int price;
  //create various method to return attribute value(s)
  public void setprice(int price)
  {
    this.price=price;
  }
  public int getprice()
  {
    return price;
  }
}
   
class Customer
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
  public void setproduct(String product)
  {
  this.product=product;
  }
  public String getproduct()
  {
    return product;
  }
  public void setquantity(int quantity)
  {
    this.quantity=quantity;
  }
  public int getquantity()
  {
    return quantity;
  }
}

class Bill
{
  public void result(int p, int q)
  {
    int r = p*q;
    System.out.print("Total Price is : "+ r);
  }
  //implement your logic to calculate total price
}
class Main
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    int amount=in.nextInt();
    int quantity=in.nextInt();
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    i.setprice(amount);
    c.setquantity(quantity);
    obj.result(amount,quantity);
    //write the logic here
  }
}