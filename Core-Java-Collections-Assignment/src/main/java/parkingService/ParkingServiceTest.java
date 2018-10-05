package parkingService;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class ParkingServiceTest {
	
	
	CarDetails car1,car2,car3;
	ParkingService parkingService;
	@Before
	public void init()
	{
		 
		 car1=new CarDetails("SanBhatt", 90513);
			car2=new CarDetails("AngBhatt", 90513);
			car3=new CarDetails("AngBhatt", 90513);
	}
	
	@Test
	public void testAddCar()
	{
		parkingService=new ParkingService();
		
		assertEquals("floor=0section=0compt=0",parkingService.addCar(car1));
	}
	@Test
	public void testAddCarVer_2()
	{
		parkingService=new ParkingService();
		parkingService.addCar(car1);
		assertEquals("floor=0section=0compt=1",parkingService.addCar(car2));
	}
	
	@Test
	public void testGetCarByIdVer_3()
	{
		
	
		assertEquals(parkingService.addCar(car2),"floor=0section=0compt=6");
	}
	
	@Test
	public void testAddCarVer_4()
	{
		
		parkingService=new ParkingService();
		assertNotNull(parkingService.addCar(null));
	}
	
	
	


}
