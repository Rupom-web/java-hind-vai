
import java.util.*;
public class OrderSystem {
 
 
    private  ArrayList<individualorder>Orders;//arraylist is a dynamic array like vector//arratlist declear
private double subTotal;
Scanner input=new Scanner(System.in);//for input individual orders single element


//a mathod to make arraylist public//always use constructor to make public
public OrderSystem (){
Orders=new ArrayList<>();//initialize arratlist
}

public  void takeindividualOrder(){

 String productName; 
double unitPrice;
int quantity;

System.out.println("Enter product name :");
productName=input.nextLine();

System.out.println("Enter unitPrice :");
unitPrice=input.nextDouble();
input.nextLine();

System.out.println("Enter Quantity :");
quantity=input.nextInt();
input.nextLine();
//print enter product,quantity,unitprice 
System.out.println("Enter product "+productName);
System.out.println("Enter price "+unitPrice);
System.out.println("Enter quantity "+quantity);


try{
individualorder Orderi=new individualorder(productName,unitPrice,quantity);
subTotal =subTotal+Orderi.total();//auto set private date subTotal because of the same class
//total()is used because of total is private else we access total=Orderi.total not total function total()
Orders.add(Orderi);}

catch (Exception e) {
  System.out.println("Error: "
                    + e.getMessage()
                    + " Skipping item.");
                      }
    }

//public double getsubTotal()//a mathod toget privet data  to another class because its not public yet
//{return subTotal;}

public double getdiscount(){
    double discount;
if(subTotal>100){
         discount=subTotal*0.2;
            }
else if(subTotal>50){
 discount=subTotal*0.1;
             }
else{ discount=subTotal*0.05;
                }
   return discount;
}

public int getdelivary(){
 if(subTotal<50)return 10;
 else return 0;}
                
 

public void printslip()
{
    System.out.println("---- final receipt----");
  //print individualorder class type orders 
    int i=1;
    for(individualorder Orderi:Orders){
System.out.println("Item"+i+"-  "+Orderi);
i++;}//Orders arrylist ke individualorder class e pass kora hoscca and seta Orderi object e store hosca

//print individualorder using tostring mathod
System.out.println("\nsubtotal :"+subTotal);
double discount=getdiscount();
System.out.println("discount :"+discount);
double delivary=getdelivary();
double total=subTotal-discount+delivary;//because same class subtotal public kora lage nai.
System.out.println("delivari fee :"+delivary);
System.out.println("Final total :"+total);
System.out.println("\n-------------------------");
}









}




