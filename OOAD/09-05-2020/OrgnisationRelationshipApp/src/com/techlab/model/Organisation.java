package com.techlab.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Organisation {

	private UUID id;
	private String name;
	private Date registrationDate;
	private List<Partner> partners = new ArrayList<Partner>();
	private List<Talent> talents = new ArrayList<Talent>();
	public static SimpleDateFormat formater = new SimpleDateFormat("dd-mm-yyyy");

	public Organisation(UUID id, String name, Date registrationDate) {
		this.id = id;
		this.name = name;
		this.registrationDate = registrationDate;
	}
	
	public void addPartners(Partner partner) {
		partners.add(partner);
	}
	
	public void addTalents(Talent talent) {
		talents.add(talent);
	}
	
	public int partnerCount() {
		return partners.size();
	}

	public Iterable<Partner> getPartners() {
		return    partners;
	}
	
	public Iterable<Talent> getTalents() {
		return    talents;
	}

	
	@Override
	public String toString() {
		return "Organisation [id=" + id + ", name=" + name + ", registrationDate=" + formater.format(registrationDate)  + "]";
	}


	
	
}

