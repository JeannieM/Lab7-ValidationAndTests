	import org.junit.jupiter.api.Assertions;
	import org.junit.jupiter.api.Test;
	
public class HTMLementTest {
/**
 * @author beanmccarthy
 */

		
		//Format: <x> OR </x>
		
		
		@Test
		public void testParagraphtag() {
			
			String element = "<p>";
			
			Assertions.assertTrue(Lab7Regex.validateHTML(element));
			
		}
		
		@Test
		public void testContainsForwardSlash() {
			
			String element = "</p>";
			
			Assertions.assertTrue(Lab7Regex.validateHTML(element));
			
		}
		
		@Test
		public void testmultipleLetters() {
			
			String element = "</br>";
			
			Assertions.assertTrue(Lab7Regex.validateHTML(element));
			
		}
		
		@Test
		public void testHasSpaces() {
			
			String element = "<a href=\"www.file.com\">";
			
			Assertions.assertTrue(Lab7Regex.validateHTML(element));
			
		}
		
		@Test
		public void testHasALotGoingOn() {
			
			String element = "<img src =\"image location\" alt=\"alternate text\" />";
			
			Assertions.assertTrue(Lab7Regex.validateHTML(element));
			
		}
		
		@Test
		public void testLacksclosingCarrot() {
			
			String element = "</p";
			
			Assertions.assertFalse(Lab7Regex.validateHTML(element));
			
		}
		
		@Test
		public void testLacksopeningCarrot() {
			
			String element = "/p>";
			
			Assertions.assertFalse(Lab7Regex.validateHTML(element));
			
		}
		
		@Test
		public void testLacksbothCarrots() {
			
			String element = "/p";
			
			Assertions.assertFalse(Lab7Regex.validateHTML(element));
			
		}
		
		@Test
		public void testOnlyOneLetter() {
			
			String element = "p";
			
			Assertions.assertFalse(Lab7Regex.validateHTML(element));
			
		}
		
		@Test
		public void testOnlyTwoLetters() {
			
			String element = "br";
			
			Assertions.assertFalse(Lab7Regex.validateHTML(element));
			
		}
		
		@Test
		public void testIsEmpty() {
			
			String element = "<>";
			
			Assertions.assertFalse(Lab7Regex.validateHTML(element));
		}
		
		
		

}
