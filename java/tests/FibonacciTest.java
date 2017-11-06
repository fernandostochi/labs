import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {
	
	private Fibonacci fibonacci;
	
	@Before
	public void setUp() {
		this.fibonacci = new Fibonacci();
	}
	
	@Test
	public void testFibonacciReturnsCorrectValueForFirstTerm() {
		int term = this.fibonacci.getValue(0);
		
		assertEquals(term,  0);
		assertEquals(term, this.fibonacci.getValueRecursively(0));
	}
	
	@Test
	public void testFibonacciReturnsCorrectValueForSecondTerm() {
		int term = this.fibonacci.getValue(1);
		
		assertEquals(term,  1);
		assertEquals(term, this.fibonacci.getValueRecursively(1));
	}
	
	@Test
	public void testFibonacciReturnsCorrectValueForThirdTerm() {
		int term = this.fibonacci.getValue(2);
		
		assertEquals(term,  1);
		assertEquals(term, this.fibonacci.getValueRecursively(2));
	}
	
	@Test
	public void testFibonacciReturnsCorrectValueForFourthTerm() {
		int term = this.fibonacci.getValue(3);
		
		assertEquals(term,  2);
		assertEquals(term, this.fibonacci.getValueRecursively(3));
	}
	
	@Test
	public void testFibonacciReturnsCorrectValueForFifthTerm() {
		int term = this.fibonacci.getValue(4);
		
		assertEquals(term,  3);
		assertEquals(term, this.fibonacci.getValueRecursively(4));
	}
	
	@Test
	public void testFibonacciReturnsCorrectValueForSixthTerm() {
		int term = this.fibonacci.getValue(5);
		
		assertEquals(term,  5);
		assertEquals(term, this.fibonacci.getValueRecursively(5));
	}
	
	@Test
	public void testFibonacciReturnsCorrectValueForSeventhTerm() {
		int term = this.fibonacci.getValue(6);
		
		assertEquals(term,  8);
		assertEquals(term, this.fibonacci.getValueRecursively(6));
	}
	
	@Test
	public void testFibonacciReturnsCorrectValueForEighthTerm() {
		int term = this.fibonacci.getValue(7);
		
		assertEquals(term,  13);
		assertEquals(term, this.fibonacci.getValueRecursively(7));
	}
	
	@Test
	public void testFibonacciReturnsCorrectValueForNinthTerm() {
		int term = this.fibonacci.getValue(8);
		
		assertEquals(term,  21);
		assertEquals(term, this.fibonacci.getValueRecursively(8));
	}
	
	@Test
	public void testFibonacciReturnsCorrectValueForTenthToHundrethTerms()
	{
		int previous_1 = 21;
		int previous_2 = 13;
		int current = 0;
		
		for(int i = 9; i < 99; i++) {
			current = previous_1 + previous_2;
			int temp = previous_1;
			previous_1 = current;
			previous_2 = temp;
			
			assertEquals(current, this.fibonacci.getValue(i));
			assertEquals(current, this.fibonacci.getValueRecursively(i));
		}
	}
}
