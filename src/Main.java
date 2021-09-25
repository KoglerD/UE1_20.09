import java.time.chrono.Era;

public class Main {

    public static void main(String[] args) {
        EratosthenesPrimeSieve eps = new EratosthenesPrimeSieve(132);
        eps.isPrime(232);
        eps.printPrimes();
        eps.printPrimeSum();
    }
}
