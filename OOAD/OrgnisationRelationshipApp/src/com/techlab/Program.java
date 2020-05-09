package com.techlab;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.UUID;

import com.techlab.model.Organisation;
import com.techlab.model.Partner;
import com.techlab.model.Talent;

public class Program {

	public static SimpleDateFormat formater = new SimpleDateFormat("dd-mm-yyyy");
	static Talent t1, t2, t3, t4, t5, t6, t7, t8, t9, t10;
	static Partner aurionpro,TCS,google,microSoft,cisco;
	
	public static void main(String[] args) throws ParseException {

		Organisation swabhav = new Organisation(UUID.randomUUID(), "swabhav", formater.parse("15-02-2000"));
	
		createTalents();
		createPartners();
		
		//Adding partners to organization
		swabhav.addPartners(aurionpro); 
		swabhav.addPartners(TCS);
		swabhav.addPartners(google);
		swabhav.addPartners(cisco);
		swabhav.addPartners(microSoft);
		//these talents are only in Swabhav organization
		swabhav.addTalents(t8);		swabhav.addTalents(t9);		swabhav.addTalents(t10);
		
		addTalentsToPartners();
		
		printInfo(swabhav);
	}


	private static void createTalents() {
		t1 = new Talent(101, "pranay", 7.9, "java", "aurionpro");
		t2 = new Talent(102, "jay", 7.7, "python", "aurionpro");
		t3 = new Talent(103, "pawan", 7.9, "c++", "TCS");
		t4 = new Talent(104, "vinay", 8.9, "javaScript", "google");
		t5 = new Talent(105, "prasad", 8.6, "PHP", "google");
		t6 = new Talent(106, "sandeep", 7.9, "java", "google");
		t7 = new Talent(107, "amey", 7.6, "python", "cisco");
		t8 = new Talent(108, "narayan", 7.8, "c++", null);
		t9 = new Talent(109, "abhisekh", 7.9, "javaScript", null);
		t10 = new Talent(110, "sagar", 8.6, "PHP", null);
	}

	private static void createPartners() {
		aurionpro = new Partner(UUID.randomUUID(), "aurionpro", 20000000, 2000);
		TCS = new Partner(UUID.randomUUID(), "TCS", 50000000, 10000);
		microSoft = new Partner(UUID.randomUUID(), "microSoft", 200000000, 50000);
		google = new Partner(UUID.randomUUID(), "google", 40000000, 980000);
		cisco = new Partner(UUID.randomUUID(), "cisco", 70000000, 10000);
		
	}
	
	private static void addTalentsToPartners() {
		aurionpro.addTalent(t1);
		aurionpro.addTalent(t2);
		TCS.addTalent(t3);
		google.addTalent(t4);
		google.addTalent(t4);
		google.addTalent(t5);
		google.addTalent(t6);
		cisco.addTalent(t7);
	}
	
	private static void printInfo(Organisation org) {
		System.out.println(org  +"\n");
		System.out.println("Organization have following talents!!!!!");
		
		Iterable<Talent> OrgTalents =	org.getTalents();
		for(Talent talent : OrgTalents) {
			System.out.println("\t"+ talent);
		}
		
		System.out.println("Organization have following Partners!!!!!");

		Iterable<Partner> partners = org.getPartners();
		for(Partner partner : partners) {
			System.out.println("\t"+ partner);
			
			System.out.println("\t\tthis Partner have following talents!!!!!");

			Iterable<Talent> talents =  partner.getTalent();
			for(Talent talent : talents) {
				System.out.println("\t\t"+ talent);
			}
			
		}
	}

}
