//Q4. Create a class called InvoiceItem, which models an item of an invoice, with ID, description, quantity and unit price. Add methods for discount applying discount and 
//taxes as well. In addition, display the invoice generated for the user’s input regarding the respective details. 

import java.util.Scanner; 

class InvoiceItem { 
    private String id; 
    private String description; 
    private int quantity; 
    private double unitPrice; 

    public InvoiceItem(String id, String description, int quantity, double unitPrice) { 
        this.id = id; 
        this.description = description; 
        this.quantity = quantity; 
        this.unitPrice = unitPrice; 
    } 

    public double applyDiscount(double discountPercentage) { 
        return (unitPrice * quantity) * (discountPercentage / 100); 
    }

    public double calculateTax(double taxPercentage) { 
        return (unitPrice * quantity) * (taxPercentage / 100); 
    }

    public void displayInvoice(double discountPercentage, double taxPercentage) { 
        double subtotal = unitPrice * quantity; 
        double discount = applyDiscount(discountPercentage); 
        double tax = calculateTax(taxPercentage); 
        double total = subtotal - discount + tax; 

        System.out.println("\n------------------------------------------");
        System.out.printf("Invoice for %s\n", description); 
        System.out.printf("Item ID: %s\n", id); 
        System.out.printf("Description: %s\n", description); 
        System.out.printf("Quantity: %d\n", quantity); 
        System.out.printf("Unit Price: $%.2f\n", unitPrice); 
        System.out.printf("Subtotal: $%.2f\n", subtotal); 
        System.out.printf("Discount: $%.2f\n", discount); 
        System.out.printf("Tax: $%.2f\n", tax); 
        System.out.printf("Total: $%.2f\n", total); 
        System.out.println("------------------------------------------"); 
    } 
} 

public class exp4_4 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter Item ID: "); 
        String id = scanner.nextLine(); 

        System.out.print("Enter Description: "); 
        String description = scanner.nextLine(); 

        System.out.print("Enter Quantity: "); 
        int quantity = scanner.nextInt(); 

        System.out.print("Enter Unit Price: "); 
        double unitPrice = scanner.nextDouble(); 

        System.out.print("Enter Discount Percentage: "); 
        double discountPercentage = scanner.nextDouble(); 

        System.out.print("Enter Tax Percentage: "); 
        double taxPercentage = scanner.nextDouble(); 

        InvoiceItem item = new InvoiceItem(id, description, quantity, unitPrice); 
        item.displayInvoice(discountPercentage, taxPercentage); 

        scanner.close(); 
    } 
}
