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
public class Problem5ClassTest {

	Problem5Class prob_5 = new Problem5Class();

	@Test
	@FileParameters("Homework4/Problem5ClassCSV.csv")
	//cart is amount on cart, creditRating is credit score of customer, isMem shows whether or not customer is a member of the store, expected is what the output should be
	public void test(double cart, int creditRating, statusClass.Status isMem, boolean expected) {
		//fail("Not yet implemented");
		assertEquals(expected, prob_5.checkOut(cart, creditRating, isMem));
	}

}
