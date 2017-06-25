
// **************************************************
// 
// 
// 
//   THIS IS GENERATED CODE - > DO NOT EDIT!! 
//
// 
// ***************************************************/

package bwi.prog2B.SS2017.wi16b044_kapferer.ExerciseSheet01.test;

import bwi.prog2B.SS2017.wi16b044_kapferer.ExerciseSheet01.Artist;

import java.lang.reflect.Field;

import org.mockito.internal.util.reflection.Whitebox;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;
import static org.testng.Assert.*;

public class ArtistTest {

	
	
	@Test
	/**
	 * checks if initial value of name is null
	 */
	public void checkInit() {
		Artist toTest = new Artist();
		// reflect private field name

		try {
			Field privateStringField = Artist.class.getDeclaredField("name");
			privateStringField.setAccessible(true);
			assertEquals(privateStringField.get(toTest), null,
					"initial value should be null");
		} catch (Exception e) {
		}
	}
	
	
	
	
	
	@Test(dataProvider = "names")
	public void getName(String in, String out) {
		Artist toTest = new Artist();
		// reflect private field name

		try {
			Field privateStringField = Artist.class.getDeclaredField("name");
			privateStringField.setAccessible(true);
			privateStringField.set(toTest, in);
		} catch (Exception e) {
		}

		assertEquals(toTest.getName(), in);
	}
	
	@Test(dataProvider = "names")
	public void setName(String in, String out) {
		Artist toTest = new Artist();
		toTest.setName(in);
		try {
			Field privateStringField = Artist.class.getDeclaredField("name");
			privateStringField.setAccessible(true);

			assertEquals(privateStringField.get(toTest), out);
		} catch (Exception e) {
		}
	}
	@DataProvider(name = "names")
	private static Object[][] names() {
		return new Object[][] { { null, null }, { "kiss", "kiss" },
				{ "", null }, { "  ", null },
				{ "Jon Bon Jovi", "Jon Bon Jovi" } };
	}
	
	
	

		
	 
	

	
}
