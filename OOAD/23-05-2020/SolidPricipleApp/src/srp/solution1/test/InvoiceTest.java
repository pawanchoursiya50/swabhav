package srp.solution1.test;

import java.util.UUID;

import srp.solution1.*;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice = new Invoice(UUID.randomUUID(), "laptop", 40000, 5);
				
		Printer printer = new Printer(invoice);
		printer.print();
	}
	
}
