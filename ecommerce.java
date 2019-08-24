import java.util.Scanner;

public class ecommerce{
    public static void main(String[] args) {

        int[] items = new int[5];
        int[] prices = new int[]{500,400,650,120,750};

        int choice = 0;
        do{
            displayItems(choice,items);
        }while(choice!=0);
        billamount(items, prices);
        
        
    }
    public static int displayItems(int choice, int items[]) {
        
        Scanner inp = new Scanner(System.in);
        do{
            System.out.println("Press 1: T-shirts(Rs.500 each)");
            System.out.println("Press 2: Pants(Rs.400 each)");
            System.out.println("Press 3: Shirts(Rs.650 each");
            System.out.println("Press 4: Caps(Rs.120 each");
            System.out.println("Press 5: Jeans(Rs.750 each)");
            System.out.println("Press 0: CHECKOUT");
            System.out.print("Enter your choice: ");
            choice = inp.nextInt();
            System.out.println("Enter the quantity: ");
            int count = inp.nextInt();
            if(choice!=0)
                items[choice] += count;
        }while(choice!=0);

        return choice;
    }
    public static void billamount(int items[],int prices[]) {

        int total = 0;
        for(int i=0;i<5;i++)
        {
            total += (items[i]*prices[i]);
        }
        System.out.println("Total Bill: " + total);
    }
}