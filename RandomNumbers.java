import java.util.Random;
import java.util.Scanner;
public class RandomNumbers {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Random random = new Random();

System.out.print("Enter the lower limit: ");
int lowerLimit = scanner.nextInt();
System.out.print("Enter the upper limit: ");
int upperLimit = scanner.nextInt();
// Generate a random number within the given limits
int randomNumber = random.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
// Print messages based on the random number generated
System.out.println("Generated Random Number:" + randomNumber);
if (randomNumber < 0) {
System.out.println("The number is negative");
} else if (randomNumber >= 0 &&randomNumber <= 10) {
System.out.println("The number is between 0 and 10.");
} else if (randomNumber >10 && randomNumber <= 50) {
System.out.println("The number is between 11 and 50.");
} else {
System.out.println(" number is greater than 50.");
}
}
}