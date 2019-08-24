/* CS50 Java Week 2 Assignment
Basic E-commerce system with console I/O
*/

import java.util.Scanner;

public class ecommerce{
    public static void main(String[] args) {

        //List of selling items
        String[] itemNames = new String[]{"T-shirts","Pants","Shirts","Caps","Jeans"}; 
        //List of prices of all selling items
        int[] prices = new int[]{500,400,650,120,750};
        //Items that are in cart
        int[] cart = new int[5];

        int choice = 0;

        displayItems(choice,cart,itemNames,prices);
        
    }
    public static void displayItems(int choice, int cart[], String itemNames[], int prices[]) {
        
        Scanner inp = new Scanner(System.in);
        do{
            System.out.println("\n\nOnline Garment Shop");
            System.out.println("----------------------");
            System.out.println("Press 1: T-shirts (Rs.500 each)");
            System.out.println("Press 2: Pants (Rs.400 each)");
            System.out.println("Press 3: Shirts (Rs.650 each");
            System.out.println("Press 4: Caps (Rs.120 each");
            System.out.println("Press 5: Jeans (Rs.750 each)");
            System.out.println("Press 10: View Cart");
            System.out.println("Press 0: CHECKOUT");
            System.out.print("Enter your choice: ");
            choice = inp.nextInt();

            switch(choice)
            {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5: System.out.print("Enter the quantity: ");
                        int count = inp.nextInt();
                        cart[choice-1] += count;
                        break;
                case 10: viewCart(cart, itemNames, prices);
                         break;
                case 0: billamount(cart, itemNames, prices);
                         break;
                default: System.out.println("Wrong Input! Please enetr correct item/option!");
            }
                
        }while(choice!=0);

        inp.close();

    }
    public static void billamount(int cart[], String itemNames[], int prices[]) {

        System.out.println("\n\nYour bill amount: ");
        System.out.println("----------------------------");
        int totalAmount = 0, totalItems = 0;
        float sgst = 0,cgst = 0;
        for(int i=0;i<5;i++)
        {
            totalItems += cart[i];
            totalAmount += (cart[i]*prices[i]);
        }
        System.out.println("Base Price-       Rs. "+totalAmount);
        System.out.println("SGST(9%)-      (+)Rs. "+(sgst += 0.09*totalAmount));
        System.out.println("CGST(11%)-     (+)Rs. "+(cgst += 0.11*totalAmount));
        System.out.println("---------------------------------");
        System.out.println("Total: "+totalItems+" items for Rs. "+(totalAmount+cgst+sgst));
        System.out.println("---------------------------------");
    }

    public static void viewCart(int cart[],String itemNames[], int prices[]) {

        int flag = 0, totalAmount = 0, totalItems = 0;

        System.out.println("\n\nYour shopping cart details: ");
        System.out.println("----------------------------");
        for(int i=0;i<5;i++) {
            if(cart[i] != 0)
            {
                flag = 1;
                totalItems += cart[i];
                totalAmount += (cart[i]*prices[i]);
                System.out.println(itemNames[i]+" X "+ cart[i]+"   = "+"Rs."+cart[i]*prices[i]);
            }
        }
        if(flag == 0) {
            System.out.println("\nYour Shopping Cart is EMPTY");
        } else{
            System.out.println("---------------------------");
            System.out.println("Total: "+totalItems+" items worth Rs."+totalAmount);
            System.out.println("---------------------------");
        }
    }
}