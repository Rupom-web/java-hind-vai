import java.util.*;
public class assaignment4 {
    public static void main(String[] args) {
        System.out.println("--- Welcome to BaseCase Shop---");
        System.out.println("how many item do you want to purchase?");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();

        OrderSystem orderManager = new OrderSystem();
        if (n > 0 && n <= 5) {n=n;}
           
      else if(n>5){n=5;System.out.println("max 5 item");
        System.out.println("converted your item to 5");
      }
    
      else {
            System.out.println("5 items max");return;
        }
                for (int i = 1; i <= n; i++) {
                     System.out.println("\nProduct " + i);
                orderManager.takeindividualOrder();
                  }
                  orderManager.printslip();
                  input.close();
    }
    
    
}
