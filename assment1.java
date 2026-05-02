
import java.util.Scanner;

public class assment1 {


     public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       String name=input.nextLine();
      double unitprice=input.nextDouble();
    int quantity =input.nextInt();
      System.out.println("--Welcome to the rupoms shop--");

      System.out.println("Enter your product name:"+name);


      System.out.println("Enter unit price:"+unitprice);

      System.out.println("Endter quantity:"+quantity);

      System.out.println("--Final Receipt--");

      System.out.println("Item:"+name);

double subtotal=(unitprice*quantity);

System.out.println("Subtotal:"+subtotal);

final double disrate=0.15;

double discount=subtotal*disrate;

System.out.println("Discount Applied:"+discount);

double total=subtotal-discount;

System.out.println("Total(round):"+Math.round(total));
 
input.close();






       
       
       
       
   }
}


