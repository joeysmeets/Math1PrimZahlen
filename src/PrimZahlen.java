
public class PrimZahlen {

	public static void main(String[] args) {
		/* Aufgabe A. */
		System.out.println(isPrime(2)  + "\n" + isPrime(5) + "\n" 
						 + isPrime(15) + "\n" + isPrime(2145));

		/* Aufgabe B. */
		System.out.println(countPrimes(2)  + "\n" + countPrimes(5) + "\n" 
				 		 + countPrimes(15) + "\n" + countPrimes(2145));
	}
	
	/**
	 * A. Schreiben Sie eine Methode boolean isPrime(int p) , 
	 * die true genau dann zurückgibt, wenn p eine Primzahl ist.
	 * 
	 * checks if a number is prime or not
	 * 
	 * @param p
	 * @return true or false
	 */
	public static boolean isPrime(int p) {
		for(int i = 2; i <= p / 2; i++) {
			if(p % i == 0) {return false;}
		}
		if(p < 2 ) return false;
		
		return true;
	}
	
	/**
	 * B. Schreiben Sie eine Methode int countPrimes(int n) , die mit Hilfe von isPrime aus
	 * a. zählt, wie viele Primzahlen es ≤ n gibt . Vergleichen Sie Ihre Ergebnisse mit der
	 * Tabelle auf Seite 3 des Skripts „Zahlentheorie“ so weit wie möglich.
	 * 
	 * counts how many prime numbers there are under a given bound
	 * 
	 * @param n
	 * @return int count of prime numbers
	 */
	public static int countPrimes(int n) {
		int count = 0;
		
		for(int i = 0; i <= n; i++) {
			if(isPrime(i)) {
				count++;			
			}
		}
		return count;
	}
	
	/**
	 * C. Schreiben Sie eine Methode boolean[] eratosthenes(int n) , die zunächst ein
	 * Feld boolean[] P = new boolean[n] mit true initialisiert und dann mit dem
	 * Sieb des Eratosthenes die Primzahlen aussiebt (P[n] == true n prim).
	 */
	public boolean[] eratosthenes(int n) {
		boolean[] p = new boolean[n];

		return null;
	}
	
	
	/**
	 * D. Messen und vergleichen Sie für die Methoden in b. und c., wie lange diese in
	 * Abhängigkeit von n rechnen.
	 */
	
}
