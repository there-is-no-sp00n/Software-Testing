package Homework4;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Test;
import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;
import static junitparams.JUnitParamsRunner.$;
//import junitparams.Parameters;



import org.junit.Before;
import org.junit.BeforeClass;

@RunWith(Parameterized.class)
public class Problem2ClassTest{
	
	private double input;
	private double output;
	private Problem2Class  prob_2;
	
	//initialize all necessary variables, resource was tutorialspoint
	@Before
	public void init() {
		prob_2 = new Problem2Class();
	}
	
	public Problem2ClassTest(double input, double output){
		this.input = input;
		this.output = output;
	}
	@Parameterized.Parameters
	public static Collection <Object[]> data() {
		
		//first parameter is the input second one is the expected output
		return Arrays.asList(new Object[][]{
				//test 1
				{350_000.01, 367_600.01},
				//test 2
				{300_000, 312_000},
				//test 3
				{150_000.01, 155_625.01},
				//test 4
				{50_000, 51_750},
				//test 5
				{25_000.01, 25_625.01},
				//test 6
				{10_000, 10_198},
				//test 7
				{9_999.99, 10_094.98},
				//test 8
				{-500, -510},
				//test 9
				{25_000, 25_498},
				//test 10
				{49_999.99, 51_249.98},
				//test 11
				{150_000, 155_250},
				//test 12
				{299_999.99, 311_249.98},
				//test 13
				{350_000, 364_000},
				//test 14
				{500_000, 525_100}
		});
		
	}
	

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(output, prob_2.calcBalance(input), 0.01);
	}

}

