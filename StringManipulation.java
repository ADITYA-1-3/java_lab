import java.util.Scanner;
public class StringManipulation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER THE FIRST STRING :");
		String firststring = input.nextLine();
		char[] firstchararray = firststring.toCharArray();
		int length = firstchararray.length;
		System.out.println("Length of the string :"+ length);
		System.out.println("ENTER THE POSITION TO FIND THE CHARACTER (0 TO "+(length - 1 )+"):");
		int position = input.nextInt();
		if (position >=0 && position<length ) {
			char characteratposition = firstchararray[position];
			System.out.println("CHARACTER AT POSITION : "+ position + ":" + characteratposition);
			
		}else {
			System.out.println("INVALID POSITION");
			
		}
		input.nextLine();
		System.out.println("ENTER THE SECOND STRING :");
		String secondstring = input.nextLine();
		String concatenatedstring = (firststring+secondstring);
		System.out.println("CONCATENATED STRING :"+ concatenatedstring);
	}
}
