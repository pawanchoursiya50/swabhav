package srp.violation.test;

import java.util.UUID;

import srp.violation.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice = new Invoice(UUID.randomUUID(), "laptop", 40000, 5);
		
		invoice.print();
	}
	
}
