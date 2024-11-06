
package sarisaristorex5;

import java.util.*;

public class SariSariStoreX5 {
   
 
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner (System.in);
    
        
        System.out.print("Enter the product name: ");
            String prodname = scanner.nextLine();
            
        System.out.print("Enter the product code: ");
            String prodcode = scanner.nextLine();
            
        System.out.print("Enter the quantity in stock: ");
            String quaStock = scanner.nextLine();
            
        System.out.print("Enter the product price per unit: ");
            String pricePerU = scanner.nextLine();
            
        System.out.print("Enter the supplier name: ");
            String supName = scanner.nextLine();
            
        System.out.print("Enter the product expiration date (dd-mm-yyyy): ");
            String exp = scanner.nextLine();
                    
        System.out.print("Enter the number of products sold today : ");
            String soldToday = scanner.nextLine();
            
        System.out.print("Enter the discount percentage (e.g., 10 for 10%): ");
            String disc = scanner.nextLine();
            
        System.out.print("Enter the reorder threshold quantity: ");
            String threshold = scanner.nextLine();
            
        System.out.print("Enter the store location: ");
            String loc = scanner.nextLine(); 
            
        System.out.println("\nResult\n");
        System.out.println("---SARI-SARI STORE INVENTORY---");
        System.out.println("Product Name:" + prodname);
        System.out.println("Product Code:" + prodcode);
        System.out.println("Quantity in Stock:" + quaStock);
        System.out.println("Price per Unit:" + pricePerU);
        System.out.println("Supplier Name:" + supName);
        System.out.println("Expiration Date:" + exp);
        System.out.println("Products Sold Today:" + soldToday);
        System.out.println("Discount Percentage:" + disc);
        System.out.println("Reorder Threshold Quantity:" + threshold);
        System.out.println("Store Location:" + loc);
                
        
    }
    
}
