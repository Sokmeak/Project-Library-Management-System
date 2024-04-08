package Java;
import java.util.Scanner;

public class Fibonacci1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = 0, n2 = 1, n3, number;

        System.out.printf("Let user input number: ");
        number = scanner.nextInt();

        System.out.println( n1 + "\n" + n2 );
        
        for( int i = 1; i < number; i++){
            n3 = n1 + n2;
            System.out.println( n3 );
            n1 = n2;
            n2 = n3;
        }

        scanner.close();
    }
    
}
