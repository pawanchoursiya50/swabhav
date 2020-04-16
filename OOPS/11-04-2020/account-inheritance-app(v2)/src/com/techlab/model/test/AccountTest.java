package com.techlab.model.test;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import com.techlab.model.*;

public class AccountTest {
	
	private static SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
	private static Date creationDate = null;
	private static Date dateofBirth = null;
	
	public static void main(String[] args) throws ParseException, IOException {
		
		Account[] accounts = new Account[5];

		
		creationDate = formatter.parse("10/25/2020");
		dateofBirth = formatter.parse("12/05/1978");
		SavingAccount sAcc1 = new SavingAccount(101, "pawan", 1000, creationDate, dateofBirth);
		accounts[0] = sAcc1;

		creationDate = formatter.parse("11/01/2020");
		dateofBirth = formatter.parse("12/05/1995");
		SavingAccount sAcc2 = new SavingAccount(102, "pawan", 1000, creationDate, dateofBirth);
		accounts[1] = sAcc2;

		creationDate = formatter.parse("12/25/2020");
		dateofBirth = formatter.parse("02/02/1950");
		CurrentAccount cAcc1 = new CurrentAccount(103, "vinay", 50000, creationDate, dateofBirth);
		accounts[2] = cAcc1;

		creationDate = formatter.parse("01/08/2020");
		dateofBirth = formatter.parse("6/9/1999");
		CurrentAccount cAcc2 = new CurrentAccount(104, "sonu", 50000, creationDate, dateofBirth);
		accounts[3] = cAcc2;
		
		creationDate = formatter.parse("10/25/2020");
		dateofBirth = formatter.parse("8/02/1987");
		CurrentAccount cAcc3 = new CurrentAccount(105, "prasad", 50000, creationDate, dateofBirth);
		accounts[4] = cAcc3;

		
		findRichAccHolder(accounts);
		findYoungAccHolder(accounts);
		writeAccountToFile(accounts);

	}


	private static void findRichAccHolder(Account[] accounts) {
		double amount = 0;
		Account richAcc = null;
		
		for(Account acc : accounts) {
			if(acc.getAmount() > amount) {
				amount = acc.getAmount();
				richAcc = acc;
			}
		}
		
		System.out.println("~~~~~Informarion of richest Account holder~~~~~");
		printInfo(richAcc);
	}

	
	private static void findYoungAccHolder(Account[] accounts) {
		System.out.println("~~~~~Informarion of youngest Account holder~~~~~");

		LocalDate current = LocalDate.now();
		Calendar c = Calendar.getInstance();

		for(Account acc : accounts) {
			
			c.setTime(acc.getDateofBirth());
			LocalDate dob = LocalDate.of(c.get(Calendar.YEAR), c.get(Calendar.MONTH)+1, c.get(Calendar.DATE));
			Period diff = Period.between(dob, current);
			
			if(diff.getYears() < 30) {
				printInfo(acc);
			}
		}
	}

	
	private static void writeAccountToFile(Account[] accounts) throws IOException {
		File file = new File("accholders.csv");
		PrintWriter writter = new PrintWriter(file);
		StringBuilder builder = new StringBuilder();
		Calendar c = Calendar.getInstance();
		LocalDate current = LocalDate.now();
		
		builder.append("Type,AccNumber,Name,Balance,CreatedOn,Age\n");
		writter.write(builder.toString());
		
		for(Account acc : accounts) {
			builder = new StringBuilder();
			builder.append(acc.getAccType() +",");
			builder.append(acc.getAccountNo() +",");
			builder.append(acc.getName() +",");
			builder.append(acc.getAmount() +",");
			builder.append(formatter.format( acc.getCreationDate() ) +",");
			
			c.setTime(acc.getDateofBirth());
			LocalDate dob = LocalDate.of(c.get(Calendar.YEAR), c.get(Calendar.MONTH)+1, c.get(Calendar.DATE));
			Period diff = Period.between(dob, current);
			builder.append(diff.getYears() +",");
			
			writter.write(builder.toString() +"\n");
		}
		writter.flush();
		writter.close();
		

	}
	
	
	private static void printInfo(Account acc) {
		System.out.println("Account no. = " + acc.getAccountNo());
		System.out.println("Name = " + acc.getName());
		System.out.println("Amount = " + acc.getAmount());
		System.out.println("creationDate = " + formatter.format(acc.getCreationDate()) );
		System.out.println("dateofBirth = " + formatter.format( acc.getDateofBirth()) +"\n" );

	}

}
