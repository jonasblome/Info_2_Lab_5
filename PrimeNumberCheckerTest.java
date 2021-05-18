import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeNumberCheckerTest {
	
	

	@Test
	void testIsPrime() {
		assertEquals(PrimeNumberChecker.isPrime(2), true);
		assertEquals(PrimeNumberChecker.isPrime(3),true);
		assertEquals(PrimeNumberChecker.isPrime(5),true);
		assertEquals(PrimeNumberChecker.isPrime(7),true);
		assertEquals(PrimeNumberChecker.isPrime(11),true);
		assertEquals(PrimeNumberChecker.isPrime(13),true);
		assertEquals(PrimeNumberChecker.isPrime(17),true);
		assertEquals(PrimeNumberChecker.isPrime(19),true);
		assertEquals(PrimeNumberChecker.isPrime(23),true);
		assertEquals(PrimeNumberChecker.isPrime(29),true);
		assertEquals(PrimeNumberChecker.isPrime(31),true);
		assertEquals(PrimeNumberChecker.isPrime(37),true);
		assertEquals(PrimeNumberChecker.isPrime(41),true);
		assertEquals(PrimeNumberChecker.isPrime(43),true);
		assertEquals(PrimeNumberChecker.isPrime(47),true);
		assertEquals(PrimeNumberChecker.isPrime(4817),true);
		assertEquals(PrimeNumberChecker.isPrime(5449),true);
		assertEquals(PrimeNumberChecker.isPrime(5471),true);
		assertEquals(PrimeNumberChecker.isPrime(7589),true);
		assertEquals(PrimeNumberChecker.isPrime(9629),true);
		assertEquals(PrimeNumberChecker.isPrime(10457),true);
		assertEquals(PrimeNumberChecker.isPrime(17387),true);
		assertEquals(PrimeNumberChecker.isPrime(21341),true);
		assertEquals(PrimeNumberChecker.isPrime(25013),true);
		assertEquals(PrimeNumberChecker.isPrime(23173),true);
		
		assertEquals(PrimeNumberChecker.isPrime(-2),false);
		assertEquals(PrimeNumberChecker.isPrime(0),false);
		assertEquals(PrimeNumberChecker.isPrime(6),false);
		assertEquals(PrimeNumberChecker.isPrime(8),false);
		assertEquals(PrimeNumberChecker.isPrime(10),false);
		assertEquals(PrimeNumberChecker.isPrime(14),false);
		assertEquals(PrimeNumberChecker.isPrime(20),false);
		assertEquals(PrimeNumberChecker.isPrime(30),false);
		assertEquals(PrimeNumberChecker.isPrime(1000),false);
		assertEquals(PrimeNumberChecker.isPrime(17400),false);
		assertEquals(PrimeNumberChecker.isPrime(20000),false);
		assertEquals(PrimeNumberChecker.isPrime(25014),false);
		assertEquals(PrimeNumberChecker.isPrime(40000),false);
		assertEquals(PrimeNumberChecker.isPrime(23150),false);
		
		
		
	}

}
