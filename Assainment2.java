
import java.util.*;

public class Assainment2 {
    
    public static void main(String[] args) {
       
        System.out.println("---Welcome to BaseCase Shop---");
        System.out.println();
        System.out.println("How many items you want to buy?");
        Scanner input=new Scanner(System.in);
     
        
//Method	কী নেয়	newline handle
//next()	1 word	buffer \n skip করে ✅
//nextLine() পুরো লাইন with space	buffer \n skip করে না ❌
 

//number of items

        int n=input.nextInt();
        input.nextLine(); // Consume the newline character
        String productName[]=new String[5];
        double price[]=new double[5];
        int quantities[]=new int[5];
        if(n<=5){
            //input of product name, price and quantity
            for(int i=0;i<n;i++){
                System.out.println("Enter product name:");
              
                productName[i]=input.nextLine();
                System.out.println("Enter the price of the product:");

                price[i]=input.nextDouble();
                System.out.println("Enter the quantity of the product:");
                quantities[i]=input.nextInt();
                input.nextLine(); // Consume the newline character
                System.out.println();
            }
            System.out.println("***********");
            System.out.println();
            System.out.println("---Final Receipt---");
            
         
            double subTotal=0;
            for(int i=0;i<n;i++){
                if(price[i]<=0 || quantities[i]<=0){
                    System.out.println("Error");
                    continue;
                }
                double itemTotal=price[i]*quantities[i];
                System.out.println("Item "+(i+1)+": "+productName[i]+" - "+quantities[i]+" x "+price[i]+" = "+itemTotal);
                subTotal+=itemTotal;
            }
            System.out.println();
            System.out.println("Subtotal: "+subTotal);
            //apply Discount
            double discount;
            if(subTotal>100){
            discount=subTotal*0.2;
                System.out.println("Discount applied(20%) :"+discount);

            }
            else if(subTotal>50){
                discount=subTotal*0.1;
                System.out.println("Discount applied(10%) :"+discount);
            }
            else{
                  discount=subTotal*0.05;
                System.out.println("Discount applied(5%) :"+discount);
             }
             double delivery=(subTotal<50)?10:0;
                System.out.println("Delivery Charges: "+delivery);
                double finalTotal=subTotal+delivery-discount;
                System.out.println();
                System.out.println("Final Total :"+finalTotal);

           
        }
 else {System.out.println("BUY MAX(0-5)");return;}


    }
}













        