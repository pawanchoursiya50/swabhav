package com.techlab.model.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.techlab.model.*;

public class CustomerTest {

	static SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
	static FileWriter csvWriter;

	public static void main(String[] args) throws ParseException, IOException {
		csvWriter = new FileWriter("G:\\swabhav\\OOAD\\16-05-2020\\shopping card app\\customers.csv", true);
		csvWriter.write("CustomerId,CustomerName,CustomerAdd,OrderNo,LineItemId,Quantity, productId,ProductName,ProductPrice\n");
		
		//creating customers
		Customer kishore = new Customer(101, "kishore", "mumbai");
		Customer vishal = new Customer(102, "vishal", "pune");

		//creating the orders
		Order order1 = new Order(10, formatter.parse("15-02-2020"));
		order1.addItem(new LineItem(10, 5, new Product(101, "book", 50, 2)));
		order1.addItem(new LineItem(11, 8, new Product(101, "book", 50, 2)));
		order1.addItem(new LineItem(12, 20, new Product(102, "pen", 10, 1)));
		
		Order order2 = new Order(10, formatter.parse("15-02-2020"));
		order2.addItem(new LineItem(13, 5, new Product(103, "mobile", 15000, 5)));
		order2.addItem(new LineItem(14, 4, new Product(104, "bag", 800, 8)));
		
		Order order3 = new Order(10, formatter.parse("15-02-2020"));
		order3.addItem(new LineItem(15, 3, new Product(105, "laptop", 32000, 1)));
		order3.addItem(new LineItem(16, 5, new Product(106, "mouse", 500, 1)));
		
		//Adding the orders to customers
		kishore.addOrder(order1);
		kishore.addOrder(order2);
		
		vishal.addOrder(order1);
		vishal.addOrder(order2);
		vishal.addOrder(order3);

		//Printing and saving customer details to file
		printInfo(kishore);
		saveIntoFile(kishore);

		printInfo(vishal);
		saveIntoFile(vishal);
		
		csvWriter.flush();
		csvWriter.close();
	}

	private static void printInfo(Customer customer) throws IOException {
		System.out.println(customer);
		int no = 0, totalCost = 0;
		Iterable<Order> orders = customer.getAllOrders();
		for (Order order : orders) {
			System.out.println("Order" + ++no);
			Iterable<LineItem> items = order.getAllItems();
			for (LineItem item : items) {
				System.out.println(item);
			}
			System.out.println("CheckOutCost for order" + no + " : " + order.checkOutCost());
			totalCost += order.checkOutCost();
		}
		System.out.println("Total cost for customer " + customer.getName() + " is :" + totalCost + "\n");
	}

	private static void saveIntoFile(Customer customer) throws IOException {
		StringBuilder build = new StringBuilder();
		String line2 = customer.getId() +","+ customer.getName() +","+ customer.getAddress() +",";
		
		int no = 0;
		Iterable<Order> orders = customer.getAllOrders();
		for (Order order : orders) {
			String line3 = line2 + "order"+ ++no +",";
			
			Iterable<LineItem> items = order.getAllItems();
			for (LineItem item : items) {
				Product prod = item.getProduct();
				String line4 = line3 + item.getId() +","+ item.getQuantity() +","+ prod.getId() +","+ prod.getName() +","+ prod.getPrice()+"\n";
				build.append(line4);
			}
		}
		csvWriter.write(build.toString() +"\n");
	}

}
