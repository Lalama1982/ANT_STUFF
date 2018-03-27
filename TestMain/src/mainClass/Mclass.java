package mainClass;
public class Mclass {
    public static void main(String[] args) {
        PrimeNumber pm = new PrimeNumber();
        int number1 = 20;
        boolean prime = pm.testPrime(number1);
        System.out.println("Testing number1:::"+number1+":::is prime:::"+prime);
    }
}