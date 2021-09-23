import java.time.chrono.Era;

public class Main {

    public static void main(String[] args) {
        EratosthenesPrimeSieve eps = new EratosthenesPrimeSieve(264);
        eps.isPrime(136);
        eps.printPrimes();
        eps.printPrimeSum();
    }

}
