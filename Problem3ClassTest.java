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
public class Problem3ClassTest {

	Problem3Class prob_3 = new Problem3Class();

	@Test
	@FileParameters("Homework4/Problem3ClassCSV.csv")
	//landing for whether or not the object is descending, altitude is the elevation of the object, speed is the |velocity| of the object, landingStatus is the expected output
	public void test(boolean landing, double altitude, double speed, landingStatus.landing landingStatus) {
		//fail("Not yet implemented");
		assertEquals(landingStatus, prob_3.landCraft(landing, altitude, speed));
	}

}
