import java.time.chrono.Era;

public class Main {

    public static void main(String[] args) {
        EratosthenesPrimeSieve eps = new EratosthenesPrimeSieve(882);
        eps.isPrime(882);
        eps.printPrimes();
        //eps.printPrimeSum();
    }

}
