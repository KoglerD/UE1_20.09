import java.time.chrono.Era;

public class Main {

    public static void main(String[] args) {
        EratosthenesPrimeSieve eps = new EratosthenesPrimeSieve(167);
        eps.isPrime(99);
        eps.printPrimes();
    }

}
