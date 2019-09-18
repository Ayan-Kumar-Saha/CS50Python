import java.util.ArrayList;
import java.util.Scanner;

class Product{

    int productCode;
    String productName;
    int productPrice;
    int productQuantity;

    public Product(int productCode, String productName, int productPrice, int productQuantity) {
        this.productCode = productCode;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

}

class Catalog{

    ArrayList<Product> catalog = new ArrayList<>();

    public void fillCatalog() {
        catalog.add(0,new Product(1,"Shirts", 400, 0));
        catalog.add(1,new Product(2,"Jeans", 500, 0));
        catalog.add(2,new Product(3,"Shoes", 300, 0));
        catalog.add(3,new Product(4,"Pants", 400, 0));
        catalog.add(4,new Product(5,"Jackets", 700, 0));
    }

    public void displayCatalog() {
        System.out.println("\n\t---Available Products---");
        System.out.println("P.Code\t\tP.Name\t\tPrice");
        for(int i=0;i<catalog.size();i++)
            System.out.println(catalog.get(i).productCode+"\t\t"+catalog.get(i).productName+"\t\t"+catalog.get(i).productPrice);
    }

}

class Cart{

    ArrayList<Product> cart = new ArrayList<>();

    public void addCart(Catalog catalog1) {

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the product code: ");
        int i = inp.nextInt();
        System.out.println("Enter the quantity: ");
        int n = inp.nextInt();
        cart.add(new Product(catalog1.catalog.get(i-1).productCode,catalog1.catalog.get(i-1).productName,catalog1.catalog.get(i-1).productPrice, n));

        inp.close();

    }

    public void displayCart() {
        System.out.println("---Cart Details---");
        for(int i=0;i<cart.size();i++) {
            System.out.println(cart.get(i).productName+" X "+cart.get(i).productQuantity+" = Rs."+cart.get(i).productPrice*cart.get(i).productQuantity);
        }
    }

    public void calculateBill() {

        int totalBill = 0;
        System.out.println("---Bill Receipt---");
        for(int i=0;i<cart.size();i++) {
            System.out.println(cart.get(i).productName+" X "+cart.get(i).productQuantity+" = Rs."+cart.get(i).productPrice*cart.get(i).productQuantity);
            totalBill += cart.get(i).productPrice*cart.get(i).productQuantity;
        }
        System.out.println("Total Bill Amount - Rs."+totalBill);
    }
}

class ecom{
    public static void main(String[] args) {

        Catalog catalog1 = new Catalog();
        Cart myCart = new Cart();

        int choice;
        do{
            choice = displayOptions();
            switch(choice) {
                case 1: catalog1.fillCatalog();
                        catalog1.displayCatalog();
                        break;
                case 2: myCart.addCart(catalog1);
                        break;
                case 3: myCart.displayCart();
                        break;
                case 4: myCart.calculateBill();
                        break;
                case 0: System.exit(0);
                default: System.out.println("WRONG INPUT!! Enter Again!!");
            }
        }while(choice!=0);
        
    }

    public static int displayOptions() {
        Scanner inp = new Scanner(System.in);

        System.out.println("\nOnline Garment Shop");
        System.out.println("Press 1: List Products");
        System.out.println("Press 2: Add products to cart");
        System.out.println("Press 3: View Cart");
        System.out.println("Press 4: Checkout");
        System.out.println("Press 0: Exit");
        System.out.print("Enter your choice: ");
        int choice = inp.nextInt();

        return choice;

        inp.close();


    }


}