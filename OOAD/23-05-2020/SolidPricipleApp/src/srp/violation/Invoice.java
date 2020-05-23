package srp.violation;

import java.util.UUID;

public class Invoice {

	private UUID id;
	private String name;
	private double cost;
	private float dicountPercentage;
	private static float GST = 25;
	
	public Invoice(UUID id, String name, double cost, float dicountPercentage) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.dicountPercentage = dicountPercentage;
	}
	
	public double calculateTax(){
		
		return  (cost*GST)/100;
	}
	public double calculateDiscountAmount() {
		 
		 return (cost*dicountPercentage)/100;
	 }
	
	 public double calculateTotalCost() {
		 
		return (cost - calculateDiscountAmount()) + calculateTax();
	 }
	 
	 public void print() {
		 System.out.println("Invoice id=" + id);
		 System.out.println("Name = " + name);
		 System.out.println("cost = " + cost);
		 System.out.println("DicountPercentage = " + dicountPercentage);
		 System.out.println("Tax = " + calculateTax());
		 System.out.println("DiscountAmount = " + calculateDiscountAmount());
		 System.out.println("TotalCost = " + calculateTotalCost());
	 }
	 
}
