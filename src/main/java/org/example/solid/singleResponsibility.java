package org.example.solid;

public class singleResponsibility {
    // A class should have only one reason to change

    public static void main(String[] args) {
        Invoice i = new Invoice("pen", 2);
        System.out.println(i.calculateTotal());
    }

}

/**
 * S: Single Responsibility
 * O: Open to extension, close for modification
 * L: liskov's principle
 * I: Interface segmentation
 * D: Dependency Inversion
 */
class Invoice {

    // this Invoice class has 2 methods, so 2 reasons to change. So it does not follow single responsibility
    String marker;
    Integer quantity;

    public Invoice(String marker, Integer quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal() {
        return quantity * 10;
    }
    public void printInvoice(){
        // prints the invoice
    }
}