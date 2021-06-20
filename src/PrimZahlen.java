
public class PrimZahlen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * checks if a number is prime or not
	 * @param n
	 * @return true or false
	 */
	public boolean isPrime (int n) {
	    
		// if n is smaller or equal to 1, it is not prime
        if (n <= 1) {
            return false;  
        }
        
        // if n is a multiple from 2, it is not prime
        else if (n % 2 == 0) {
            return false;
        }
 
        // checks the last odds, if n is not prime
        for (int i = 2; i<= n/2; i++){
        	if ((n % i) == 0)
                return false;
        }
        // if all above conditions and they were not true, n is prime
        return true;
	}
}
