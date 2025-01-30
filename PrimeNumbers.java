import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int n = obj.nextInt();
        System.out.println("PRIME NUMBERS ARE:");
        
        int i,j;
        for (i=1;i<=n;i++)
        { int count = 0 ;
        	for (j=1;j<=i;j++) {
        		if (i % j==0 )
        		{count++;}
        	}
        	if (count==2)
        	{System.out.println(i);}
        	}
        }
}
