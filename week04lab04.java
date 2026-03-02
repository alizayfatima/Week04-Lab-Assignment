import java.util.Scanner;
public class week04lab04 {
    public static boolean isPrimeNumber(int n) {
        // returns true if n is prime, false otherwise
        if (n <= 1) {
            return false;
        }
    
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        if (isPrimeNumber(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        
    }
    }

}