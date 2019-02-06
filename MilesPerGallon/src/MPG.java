import java.util.Scanner;
public class MPG{
	
	public static void main( String [ ] args  ){
		
		Scanner scanner = new Scanner(System.in);
		double userMiles;
		double userGallons;
		double MilesPerGallon;
		
		System.out.println("Please enter the miles:");
		userMiles = scanner.nextDouble();
		
		System.out.println("Please enter the gallons of gas used:");
		userGallons = scanner.nextDouble();
		
		MilesPerGallon = userMiles / userGallons;
		
		System.out.printf ( " Miles per gallon is %.2f" , MilesPerGallon );
		
		
	}
	

}
