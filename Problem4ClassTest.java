package Homework4;

import static org.junit.Assert.*;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Test;
import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

//import junitparams.Parameters;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@RunWith(JUnitParamsRunner.class)
public class Problem4ClassTest {

	Problem4Class prob_4 = new Problem4Class();
	

	@Test
	@FileParameters("Homework4/Problem4ClassCSV.csv")
	//x is the input, y is the expected output
	public void test(double x, double y) {
		//fail("Not yet implemented");
		assertEquals(y, prob_4.calcY(x), 0.01);
	}

}
