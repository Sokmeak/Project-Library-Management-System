package Java;
import java.util.Scanner;
public class Fibonacci {

    public static int Fibo(int x) {
      if (x <= 1) {
        return x;
      }
      return Fibo(x - 1) + Fibo(x - 2);
    }
  
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.printf("Let user input number:");
      int number = scanner.nextInt();
      for (int i = 0; i <= number; i++) {
        System.out.println(Fibo(i));
      }
      scanner.close();
    }
  }
  