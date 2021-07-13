import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

class PrimZahlenTest {
	
	private PrimZahlen checker;

	@BeforeEach
	void setUp() throws Exception {
		PrimZahlen checker = new PrimZahlen();
	}

	/* Tests for A */
	@Test
	void test1() {
		assertEquals(true, checker.isPrime(2));
	}

	@Test
	void test2() {
		assertEquals(false, checker.isPrime(268));
	}
	
	@Test
	void test3() {
		assertEquals(true, checker.isPrime(389));
	}
	
	@Test
	void test4() {
		assertEquals(true, checker.isPrime(17));
	}
	
	@Test
	void test5() {
		assertEquals(false, checker.isPrime(13067));
	}
	
	
	/* Tests for B */
	@Test
	void test6() {
		assertEquals(1, checker.countPrimes(2));
	}
	
	@Test
	void test7() {
		assertEquals(3, checker.countPrimes(5));
	}
	
	@Test
	void test8() {
		assertEquals(6, checker.countPrimes(15));
	}
	
	@Test
	void test9() {
		assertEquals(324, checker.countPrimes(2145));
	}
	
	@Test
	void test10() {
		assertEquals(1203, checker.countPrimes(9762));
	}

	/* Tests for C */
	@Test
	void test11() {
		assertEquals("[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]", checker.eratosthenes(100));
	}

	@Test
	void test12() {
		assertEquals("[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199]", checker.eratosthenes(200));
	}

	@Test
	void test13() {
		assertEquals("[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499]", checker.eratosthenes(500));
	}

	@Test
	void test14() {
		assertEquals("[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887, 907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997]", checker.eratosthenes(1000));
	}

	@Test
	void test15() {
		assertEquals("[2, 3, 5, 7, 11, 13, 17, 19]", checker.eratosthenes(20));
	}
}
