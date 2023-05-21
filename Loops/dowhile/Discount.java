import java.util.Scanner;
/*

 * Takes user input of itemprice
 * Discounting 15% of the total price
 * Output the new price after the discount
 * 
 *The customer has to buy 3 items for the discount program to be effective
 */

class Discount {
    public static void main(String[] args){
        try (Scanner price = new Scanner(System.in)) {
            int purchasedItems = 0;
            double itemPrice = 0;

            do {
                System.out.print("Enter item price: ");
                itemPrice = price.nextDouble();
                double newPrice = itemPrice - (itemPrice * 0.15);
                System.out.println("New Price: "+ newPrice);
                System.out.println();
                purchasedItems++;

            } while (purchasedItems < 3);
        }
        catch(Exception e1){
            System.out.print("Error");
        }
        
    }
}
