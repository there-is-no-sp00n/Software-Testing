package Homework4;

import static org.junit.Assert.*;
import org.junit.Test;
import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;
import static junitparams.JUnitParamsRunner.$;
import junitparams.Parameters;

import org.junit.Before;
import org.junit.BeforeClass;

@RunWith(JUnitParamsRunner.class)
public class Problem1ClassTest {
	
	Problem1Class prob_1 = new Problem1Class() ;
	
	@SuppressWarnings("unused")
	private static final Object[] the_nums() {
		//First is the cart value, second is the tax rate, third is the expected output
		
		return $(
		//Test 1
		$(500, 0.0825, 541.25),
		//Test 2
		$(1_499.99, 0.0825, 1_461.36),
		//Test 3
		$(2_500, 0.0825, 2_300.31),
		//Test 4
		$(3_499.99, 0.0825, 3_030.99),
		//Test 5
		$(0, 0.0825, 0),
		//Test 6
		$(3_500, 0.0825, 2_841.56),
		//Test 7
		$(500.01, 0.0825, 487.13),
		//Test 8
		$(1_500, 0.0825, 1_380.18),
		//Test 9
		$(2_500.01, 0.0825, 2_165.00),
		//Test 10
		$(10_000, 0.0825, 8_118.75)
		);
	}	
	
	@Test
	@Parameters(method="the_nums")
	public void test(double cart, double taxRate, double expected)
	{
		assertEquals(expected, prob_1.determineMemberDiscount(cart, taxRate), 0.01);		
	}
	
}
