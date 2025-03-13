import java.util.Scanner;
public class SimpleExceptionDemo {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

// a) Arithmetic Exception
try {
System.out.print("Divide 10 by: ");
int num = scanner.nextInt();
System.out.println("Result: " + (10 / num));
} catch (ArithmeticException e) {
System.out.println("Error: Cannot divide by zero!");
}

// b) Number Format Exception
try {
System.out.print("Enter a number: ");
int parsedNumber = Integer.parseInt(scanner.next());
System.out.println("Parsed Number: " + parsedNumber);
} catch (NumberFormatException e) {
System.out.println("Error: Invalid number format!");
}

// c) ArrayIndexOutOfBoundsException
try {
int[] array = {1, 2, 3};
System.out.print("Access index (0-2): ");
int index = scanner.nextInt();
System.out.println("Array value: " + array[index]);
} catch (ArrayIndexOutOfBoundsException e) {




System.out.println("Error: Index out of bounds!");
}

// d) NegativeArraySizeException
try {
System.out.print("Enter array size: ");
int size = scanner.nextInt();
int[] array = new int[size]; // May throw NegativeArraySizeException
System.out.println("Array created with size: " + size);
} catch (NegativeArraySizeException e) {
System.out.println("Error: Size cannot be negative!");
}
}
}
