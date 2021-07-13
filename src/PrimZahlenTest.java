import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrimZahlenTest {
	
	private PrimZahlen checker;

	@BeforeEach
	void setUp() throws Exception {
		PrimZahlen checker = new PrimZahlen();
	}

	//Tests for A
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
	
	
	//Tests for B
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

}
