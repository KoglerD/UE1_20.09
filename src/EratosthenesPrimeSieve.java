import java.util.ArrayList;

public class EratosthenesPrimeSieve implements PrimeSieve{

    private int upperNumber;
    private ArrayList<Integer> primeList;
    private ArrayList<Integer> allList;

    public EratosthenesPrimeSieve(int upperNumber) {
        this.upperNumber = upperNumber;
    }

    @Override
    public boolean isPrime(int p) {
        if (p < 2){
            return false;
        }

        allList = new ArrayList<>();
        for (int i = 2; i <= upperNumber; i++) {
            allList.add(i);
        }
        primeList = new ArrayList<Integer>();
        for (int i = 2; i < (p); i++) {
            for (int j = 1; j < (p/2); j++) {
                if (allList.contains(i*j)){
                    allList.remove((Integer)(i*j));
                }
            }

        }

        if (allList.contains(p)){
            System.out.println("Die Zahl "+p+" ist eine Primzahl");
            return true;
        }
        System.out.println("Die Zahl "+p+" ist keine Primzahl");
        return false;
    }

    @Override
    public void printPrimes() {
        allList = new ArrayList<>();
        for (int i = 2; i <= upperNumber; i++) {
            allList.add(i);
        }
        primeList = new ArrayList<>();
        for (int i = 2; i < (allList.size()); i++) {
            for (int j = 2; j < (allList.size()); j++) {
                if (allList.contains(i*j)){
                    allList.remove((Integer)(i*j));
                }
            }

        }

        System.out.println("Alle Primzahlen von 2 bis "+upperNumber+" lauten: ");
        for (int i = 0; i < allList.size(); i++) {
            System.out.println(allList.get(i)+": ist eine Primzahl");
        }

    }
}
