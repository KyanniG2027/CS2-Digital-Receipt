   public class Main {
  public static void main(String [] args) {
     // RECEIPT PRINTOUT SECTION

     String highschoolName = "Birch Wathen Lenox";
   
      double drinkPrice = 1.50;
      double candyPrice = 1.25;
      double hotdogPrice = 2.75;
      double hamburgerPrice = 3.50;
   
   
   
   
   
     System.out.println("**************************************");
     System.out.println("*                                    *");
     System.out.println("*   " + highschoolName + " Snack Bar *");
     System.out.println("*                                    *");
     System.out.println("*     Drink ..........$" + drinkPrice +"    *");                      
     System.out.println("*     Candy + $" + candyPrice   +"     *");     
     System.out.println("*     Hot Dog + $" + hotdogPrice +"      *");     
     System.out.println("*     Hamburger + $" + hamburgerPrice +"   *");     
     System.out.println("*                                    *");    
     System.out.println("**************************************");

   int orderNumber = (int) (Math.random()* 100 + 1 );
   System.out.println(orderNumber);

   int drinksOrdered = (int) (Math.random()* 3 + 1 );
   System.out.println(drinksOrdered);

   int candiesOrdered = (int) (Math.random() * 3 + 1 );
   System.out.println(candiesOrdered);

   int hotDogs = (int) (Math.random()* 3 + 1 );
   System.out.println(hotDogs);

   int hamburgersOrdered = (int) (Math.random() * 3 + 1 );
   System.out.println(hamburgersOrdered);



   double taxRate = 0.08;
   double subtotal = priceDrink *  drinksOrdered + candiesOrdered + hotDogs + hamburgersOrdered; 
   double totalTax = subtotal * taxRate;
   double total = subtotal + totalTax; 








     }

  }














