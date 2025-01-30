import java.util.Scanner;

public class StringBuffers{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE STRING: ");
        StringBuffer sb = new StringBuffer(input.nextLine());
        
        
        System.out.println("Length: " + sb.length());
        System.out.println("REVERSED: " + sb.reverse());  
        
        System.out.println("START INDEX TO DELETE:");
        int start = input.nextInt();
        System.out.println("END INDEX TO DELETE:");
        int end = input.nextInt();
        
        if (start >= 0 && end <= sb.length() && start < end) {
            sb.delete(start, end);  
            System.out.println("AFTER DELETION: " + sb);
        } else {
            System.out.println("INVALID INDICES");
        }
        
        input.close();  
    }
}
