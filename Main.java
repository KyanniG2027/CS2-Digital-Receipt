  import java.util.Scanner;
  public class Main {
  public static void main(String [] args) {
     // RECEIPT PRINTOUT SECTION

   Scanner input = new Scanner(System.in);

     String highschoolName = "Birch Wathen Lenox";
   
      double drinkPrice = 1.50;
      double candyPrice = 1.25;
      double hotdogPrice = 2.75;
      double hamburgerPrice = 3.50;
   


   int orderNumber = (int) (Math.random()* 100 + 1 );
   //System.out.println(orderNumber);
   System.out.println("Order Number: " + orderNumber);

   int drinksOrdered = input.nextInt();
   //System.out.println(drinksOrdered);

   int candiesOrdered = input.nextInt();
   //System.out.println(candiesOrdered);

   int hotDogs = input.nextInt();
   //System.out.println(hotDogs);

   int hamburgersOrdered = input.nextInt();
   //System.out.println(hamburgersOrdered);

   
   System.out.println(drinksOrdered);
   System.out.println(candiesOrdered);
   System.out.println(hotDogs);
   System.out.println(hamburgersOrdered);




   double taxRate = 0.08;
   double subtotal = drinkPrice *  drinksOrdered + candyPrice * candiesOrdered + hotdogPrice * hotDogs + hamburgerPrice * hamburgersOrdered; 
   double totalTax = subtotal * taxRate;
   double total = subtotal + totalTax; 
   //System.out.println(subtotal);
   //System.out.println(totalTax);
   //System.out.println(total);


    System.out.println("**************************************");
     System.out.println("*    "    + orderNumber  + "                       *");
     System.out.println("*   " + highschoolName + " Snack Bar *");
     System.out.println("*                                    *");
     System.out.println("*     Drink ..........$" + drinkPrice +" *");                      
     System.out.println("*     Candy + $" + candyPrice   +"     *");     
     System.out.println("*     Hot Dog + $" + hotdogPrice +"    *");     
     System.out.println("*     Hamburger + $" + hamburgerPrice +"*");     
     System.out.println("*     Total + $" + total + "                     *");    
     System.out.println("**************************************");


     }

  }














