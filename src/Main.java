import java.time.chrono.Era;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine Obergrenze ein: ");
        String upperN = scanner.nextLine();
        int upperNumber = Integer.parseInt(upperN);
        EratosthenesPrimeSieve eps = new EratosthenesPrimeSieve(upperNumber);
        System.out.println("Bei welcher Zahl wollen Sie wissen, ob es eine Primzahl ist?!");
        String isP = scanner.nextLine();
        int isPrim = Integer.parseInt(isP);
        eps.isPrime(isPrim);
        eps.printPrimes();
        eps.printPrimeSum();
    }
}
