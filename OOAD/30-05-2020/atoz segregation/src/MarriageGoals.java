import java.util.Scanner;

public class MarriageGoals {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int happiness =0;
		int sadness = 0;
		
		System.out.println("Enter number of days : ");
		int days = scn.nextInt();
		
		int[] fishes = new int[days];

		
		System.out.println("Enter no of fishes caught by husband every day : ");
		fishes[0] = scn.nextInt();
		int max = fishes[0];
		int min = fishes[0];
	
		for(int i=1; i< days; i++) {
			fishes[i] = scn.nextInt();
			
			if(fishes[i] > max) {
				max = fishes[i];
				happiness++;
			}
			else if(fishes[i] < min) {
				min = fishes[i];
				sadness++;
			}
		}
		
		
		System.out.println("wife was happy with husband for : "+ happiness + " days \nwife was sad with husband for : "+ sadness+" days");
		
		System.out.println("Hence happiness of wife is : "+ (happiness - sadness));
		int happinessPer = ((happiness/days)*100);
		int sadnessPer = ((sadness/days)*100);

		System.out.println("In percentage happiness of wife is : "+ (happinessPer - sadnessPer));
		
		scn.close();
	}
	

}
