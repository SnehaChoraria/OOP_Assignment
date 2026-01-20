class Invoice {
    String partNumber;
    String partDescription;
    int quantity;
    double pricePerItem;

    Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity > 0 ? quantity : 0;
        this.pricePerItem = pricePerItem > 0 ? pricePerItem : 0;
    }

    double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

     int getQuantity() {
        return quantity;
    }
}

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice inv = new Invoice("A101", "Pen", 2, 50);
        System.out.println("Invoice Amount: " + inv.getInvoiceAmount());
    }
}