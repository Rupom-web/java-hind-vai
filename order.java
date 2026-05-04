public class order {
   public String productName; 
   private double unitPrice;
   private  int quantity;

/*Validation:
Constructor + setters both check values.
If invalid → throws Exception.*/

    //constructor
   order( String productName,double unitPrice,int quantity)throws Exception
   {this.productName=productName;
      if(unitPrice <=0)
       { throw  new Exception("Unit Price must be greater than zero");}
      if(quantity<=0)
        { throw  new Exception("Quantity must be greater than zero");}

    this.unitPrice=unitPrice;
    this.quantity=quantity;
   }

   //for praivet data individual change
/*void setproductName(String productName)
   {this.productName=productName;}
void setunitPrice(double unitPrice)
   {
      this.unitPrice=unitPrice;}
void setquanty(int quantity)
   {
  
      this.quantity=quantity;}*/
/*
 /* 
//get praivet,protected
   String getproductName()
   {return this.productName;}
    int getquantity()
   {return this.quantity;}
     double getunitPrice()
   {return this.unitPrice;}*/

public double total()
{return quantity*unitPrice;}

/*toString():
Automatically formats output when you print the object.*/

//print method
   public String toString() {
        return productName + " - " + quantity + " pcs x " + unitPrice + " = " + total();}
}
