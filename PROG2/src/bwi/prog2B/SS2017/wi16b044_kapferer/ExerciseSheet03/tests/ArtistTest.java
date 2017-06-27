
// **************************************************
// 
// 
// 
//   THIS IS GENERATED CODE - > DO NOT EDIT!! 
//
// 
// ***************************************************/

package bwi.prog2B.SS2017.wi16b044_kapferer.ExerciseSheet03.tests;

import java.lang.reflect.Field;

import org.mockito.internal.util.reflection.Whitebox;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import bwi.prog2X.SS201X.wiXXbXXX_LastName.AssignmentXX.entities.*;

import static org.mockito.Mockito.mock;
import static org.testng.Assert.*;

public class ArtistTest {

	
	
	
	
	
	
	
	

	
	@DataProvider(name = "names2")
	private static Object[][] names2() {
		return new Object[][] { { null, "unknown" }, { "kiss", "kiss" },
				{ "", "unknown" }, { "  ", "unknown" },
				{ "Jon Bon Jovi", "Jon Bon Jovi" } };
	}
		
	 
	
	/**************** ES 03 ***********************/
	@Test(dataProvider = "names2")
	public void testtoString(String in, String out) {
		
		boolean myTest=(new Artist(in).toString()==out)||
				(new Artist(in).toString()==in);
		assertEquals(myTest, true);
	}
	


	

	
}
