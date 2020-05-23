package srp.solution1;

import srp.solution1.Invoice;

public class Printer {

	public Invoice invoice;
	
	public Printer(Invoice invoice2) {
		this.invoice = invoice2;
	}

	public void print() {
		 System.out.println("Invoice id=" + invoice.getId());
		 System.out.println("Name = " + invoice.getName());
		 System.out.println("cost = " + invoice.getCost());
		 System.out.println("DicountPercentage = " + invoice.getDicountPercentage());
		 System.out.println("Tax = " + invoice.calculateTax());
		 System.out.println("DiscountAmount = " + invoice.calculateDiscountAmount());
		 System.out.println("TotalCost = " + invoice.calculateTotalCost());
	}
}
