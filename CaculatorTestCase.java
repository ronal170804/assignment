package assignment;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class CaculatorTestCase {

Scanner sc = new Scanner(System.in);
	
	CalculatorTest ob = new CalculatorTest();
	
	@Test
	void factorialtest() {
		assertEquals(120,ob.factorial(5));
				     }

	@Test
	void meantest() {
		assertEquals(3.0,ob.mean());	
				}
	
	@Test
	void SimpleInteresttest() {	
		ob.show1();
		ob.setPrincipal(sc.nextDouble());		//75,000
		ob.setRate(sc.nextDouble());		//5.4	
		ob.setTime(sc.nextDouble());		//2	
		assertEquals(8100.0,ob.simpleInterest());
						 }
		
	@Test
	void CompoundInteresttest() {		
		ob.show1();
		ob.setPrincipal(sc.nextDouble());		//60000
		ob.setRate(sc.nextDouble());			//6.5
		ob.setTime(sc.nextDouble());			//3
		assertEquals(2.52525E7,ob.compoundInterest());
						 }
	
	@Test
	void percentagetest() {
		ob.show2();
		ob.setMaxMarks(sc.nextDouble());
		ob.setMarks(sc.nextDouble());
		assertEquals(75.0,ob.percentage());
		
	}

}
