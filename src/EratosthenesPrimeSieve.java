import java.util.ArrayList;

public class EratosthenesPrimeSieve implements PrimeSieve{

    private int upperNumber;
    private ArrayList<Integer> primeList;

    public EratosthenesPrimeSieve(int upperNumber) {
        this.upperNumber = upperNumber;
    }

    @Override
    public boolean isPrime(int p) {
        if (p == 2){
            return true;
        }

        for (int i = 3; i < (p/2); i++) {
            for (int j = 2; j < p/2; j++) {
                if (p > 2){
                    /*if ((i^j) <= (p/2)){

                    }
                    if ((p/i) != (){

                    }*/
                }
            }

        }


        return false;
    }

    @Override
    public void printPrimes() {

    }
}
