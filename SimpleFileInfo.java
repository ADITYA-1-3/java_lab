import java.io.File;
import java.util.Scanner;
public class SimpleFileInfo {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the filename: ");
String filename = scanner.nextLine();
File file = new File(filename);
if (file.exists()) {
System.out.println("File exists: Yes");
System.out.println("Readable: " + file.canRead());
System.out.println("Writable: " + file.canWrite());
System.out.println("Type: " + (file.isDirectory() ? "Directory" : "File"));
System.out.println("Size: " + file.length() + " bytes");
} else {
System.out.println("File exists: No");
}
}
}
