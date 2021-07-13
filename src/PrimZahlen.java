import java.util.Arrays;

public class PrimZahlen {

	public static void main(String[] args) {

		/* Aufgabe A. */
		System.out.println("Exercise A");
		System.out.println("##########################");
		System.out.println(isPrime(2)  + "\n" + isPrime(5) + "\n"
						 + isPrime(15) + "\n" + isPrime(2145));

		/* Aufgabe B. */
		System.out.println("\n" + "Exercise B");
		System.out.println("##########################");
		System.out.println(countPrimes(2)  + "\n" + countPrimes(5) + "\n"
				 		 + countPrimes(15) + "\n" + countPrimes(2145));


		/* Aufgabe C. */
		System.out.println("\n" + "Exercise C");
		System.out.println("##########################");
		System.out.println(Arrays.toString(eratosthenes(100)));
		System.out.println(Arrays.toString(eratosthenes(200)));
		System.out.println(Arrays.toString(eratosthenes(500)));
		System.out.println(Arrays.toString(eratosthenes(1000)));
		System.out.println(Arrays.toString(eratosthenes(20)));

		/* Aufgabe D */
		System.out.println("\n" + "Exercise D");
		System.out.println("##########################");
		measureSpeed();
	}
	
	/**
	 * A. Schreiben Sie eine Methode boolean isPrime(int p) , 
	 * die true genau dann zurückgibt, wenn p eine Primzahl ist.
	 * 
	 * checks if a number is prime or not
	 * 
	 * @param p prime number
	 * @return true or false
	 */
	public static boolean isPrime(int p) {
		for(int i = 2; i <= p / 2; i++) {
			if(p % i == 0) {return false;}
		}
		return p >= 2;
	}
	
	/**
	 * B. Schreiben Sie eine Methode int countPrimes(int n) , die mit Hilfe von isPrime aus
	 * a. zählt, wie viele Primzahlen es ≤ n gibt . Vergleichen Sie Ihre Ergebnisse mit der
	 * Tabelle auf Seite 3 des Skripts „Zahlentheorie“ so weit wie möglich.
	 * 
	 * counts how many prime numbers there are under a given bound
	 * 
	 * @param n bound
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
	static int[] eratosthenes(int n) {

		final int maxP = (int)Math.sqrt(n)+2;
		boolean[] p = new boolean[n];

		for (int i = 0; i < n; i++)
			p[i] = i%2 == 1;

		for (int prim = 3; prim < maxP; prim += 2)
			if (p[prim]) {
				for (int i = prim; i <= n / prim; i++) {
					final int zahl = i*prim;
					if (zahl < n)
						p[zahl] = false;
				}
			}

		// Anzahl der gefundenen Primzahlen:
		int anzahl = 0;
		for (boolean istPrim : p)
			if (istPrim)
				anzahl++;

		int[] primzahlen = new int[anzahl];
		int index = 0;
		for (int i = 0; i < p.length; i++)
			if (p[i])
				primzahlen[index++] = i;
		primzahlen[0] = 2;

		return primzahlen;
	}

	
	/**
	 * D. Messen und vergleichen Sie für die Methoden in b. und c., wie lange diese in
	 * Abhängigkeit von n rechnen.
	 */
	public static void measureSpeed() {

		long start = 0;
		long finish = 0;
		long timeElapsed = 0;

		/* measure b */
		start = System.nanoTime();

		isPrime(23523);

		finish = System.nanoTime();
		timeElapsed = finish - start;
		System.out.println("Time elapsed for b: " + timeElapsed);


		/* measure c */
		start = System.nanoTime();

		eratosthenes(50000);

		finish = System.nanoTime();
		timeElapsed = finish - start;
		System.out.println("Time elapsed for c: " + timeElapsed);

	}
}
