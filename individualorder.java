public class individualorder {
   private String productName; 
   private double unitPrice;
   private  int quantity;
private double total;
/*Validation:
Constructor + setters both check values.
If invalid → throws Exception.*/

    //constructor use to public for use other class//note:here we only public productName,unitPrice,quantity not total
 //   because we didnt pass total value on to public mathod
  public individualorder( String productName,double unitPrice,int quantity)throws Exception
   {
    if(unitPrice <=0)
      { throw  new Exception("Unit Price must be greater than zero");}
     if(quantity<=0)
       { throw  new Exception("Quantity must be greater than zero");}
this.productName=productName;
    this.unitPrice=unitPrice;
    this.quantity=quantity;
    this.total=quantity*unitPrice;
   }

   // a method for praivet data individual change and do it public variable use for another class
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
//get method use to public (praivet,protected )data use for another class
   String getproductName()
   {return this.productName;}
    int getquantity()
   {return this.quantity;}
     double getunitPrice()
   {return this.unitPrice;}*/
   
//make private total public to use it another class //known as getter mathod
public double total()
{return total;}

/*toString():
Automatically formats output when you print the object.*/

//print method
   public String toString() {
        return productName + " - " + quantity + " pcs x " + unitPrice + " = " + total();}
}









   
