import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrimZahlenTest {
	
	private PrimZahlen checker;

	@BeforeEach
	void setUp() throws Exception {
		PrimZahlen checker = new PrimZahlen();
	}

	@Test
	void test1() {
		assertEquals(false, checker.isPrime(2));
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
	
	@Test
	void test6() {
		assertEquals(true, checker.isPrime(97));
	}
	
//	@Test
//	void test() {
//		assertEquals(false, checker.isPrime(2));
//	}
}
