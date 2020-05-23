package srp.solution1;

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

	public double calculateTax() {

		return (cost * GST) / 100;
	}

	public double calculateDiscountAmount() {

		return (cost * dicountPercentage) / 100;
	}

	public double calculateTotalCost() {

		return (cost - calculateDiscountAmount()) + calculateTax();
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public float getDicountPercentage() {
		return dicountPercentage;
	}

	public static float getGST() {
		return GST;
	}

}
