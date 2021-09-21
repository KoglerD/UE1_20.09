import java.time.chrono.Era;

public class Main {

    public static void main(String[] args) {
        EratosthenesPrimeSieve eps = new EratosthenesPrimeSieve(50);
        eps.isPrime(27);
        eps.printPrimes();
    }

}
