import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CDeliveryJTest {

	CDelivery Cobj = new CDelivery();
	
	@Test
	public void testPriceForDistanceLessThan10KM() {
		Assert.assertEquals(10, Cobj.PriceForDistance(8));	
		//fail("Not yet implemented");
	}
	
	@Test
	public void testPriceForDistanceGreaterThan10KM() {
		Assert.assertEquals(25, Cobj.PriceForDistance(15));
	}
	
	@Test
	public void testPriceForDistanceAndStairsLessThan10KM() {
		Assert.assertEquals(20, Cobj.PriceForDistanceAndStairs(8));
	}
	
	@Test
	public void testPriceForDistanceAndStairsGreaterThan10KM() {
		Assert.assertEquals(35, Cobj.PriceForDistanceAndStairs(15));
	}

	//Negative 
	@Test
	public void testPriceForDistanceLessThanZeroKM() {
		Assert.assertEquals(0, Cobj.PriceForDistanceAndStairs(-1));
	}
	
	//Negative 
		@Test
		public void testPriceForDistanceAndStairsLessThanZeroKM() {
			Assert.assertEquals(0, Cobj.PriceForDistance(-1));
		}

		@Test
		public void testWeekEnd() {
			Assert.assertEquals(50, Cobj.Weekend());		
			}
}
