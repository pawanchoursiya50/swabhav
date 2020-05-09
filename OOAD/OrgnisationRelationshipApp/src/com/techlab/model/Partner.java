package com.techlab.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Partner {

	private UUID id;
	private String name;
	private double companyTurnOver;
	private long empStrength;
	private List<Talent> talents = new ArrayList<Talent>();
	
	public Partner(UUID id, String name, double companyTurnOver, long empStrength) {
		this.id = id;
		this.name = name;
		this.companyTurnOver = companyTurnOver;
		this.empStrength = empStrength;
	}

	
	public void addTalent(Talent talent) {
		talents.add(talent);
	}
	
	public Iterable<Talent> getTalent() {
		return talents;
	}
	
	@Override
	public String toString() {
		return "Partner [id=" + id + ", name=" + name + ", companyTurnOver=" + companyTurnOver + ", empStrength="
				+ empStrength + "]";
	}
	
	
	
	
}
