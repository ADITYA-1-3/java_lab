//PROGRAM_7
import java.util.Scanner;
public class StringConcatenation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER THE FIRST STRING :");
		String str1 = input.nextLine();
		System.out.println("ENTER THE SECOND STRING :");
		String str2 = input.nextLine();
		String concatenated = str1 + str2 ;
		System.out.println("CONCATENATED STRING :"+concatenated);
		System.out.println("ENTER THE SUBSTRING TO SEARCH :");
		String substring = input.nextLine();
		if (concatenated.contains(substring)) {
			System.out.println("SUBSTRING FOUND !");
			
		}
		else {
			System.out.println("SUBSTRING NOT FOUND !");
			
		}
		System.out.println("ENTER THE FIRST INDEX :");
		int start = input.nextInt();
		System.out.println("ENTER THE LAST INDEX :");
		int end = input.nextInt();
		if (start >= 0 && end <= concatenated.length()) {
			String extracted = concatenated.substring(start, end);
			System.out.println("STRING EXTRACTED :"+ extracted);
			
		}
		else {
			System.out.println("INVALID INDICES");
		}
	}
}
