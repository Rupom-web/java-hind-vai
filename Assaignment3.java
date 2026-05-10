
public class Assaignment3 {
    public static void main(String[] args) {
   
   
   System.out.println("----Order Test----");
   
   try {
   //way to access class
        individualorder first=new individualorder("mouse",230,3);//initilazation for all public,private,protected
   // first.productName="fdjsd"; //public data individual input
  // first.productName//public output
  //note:private methode is used for all public,private,prodected data
  
  individualorder second=new individualorder("keyboard",500,5);
  System.out.println(first.toString());//you can write also "first"
  System.out.println(second.toString());//you can write also "second"
 }
 catch (Exception e){
    System.out.println("Error: "+e.getMessage());

 }
 System.out.println("--- Invalid Order Attempt ---");

/*try-catch:
Prevents program crash when invalid input is given.*/


//second part

 try { individualorder another=new individualorder("another",-10,5);
 System.out.println(another.toString());//you can write also "another"
     
 } catch (Exception e) {
     System.out.println("Error: "+e.getMessage());
 }

    }
 



}
