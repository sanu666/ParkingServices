package parkingService;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class ParkingService {
	
	int building[][]=new int[4][4];
	LinkedList<String> removeGetId=new LinkedList<>();
	 int rowCount=0;
	 int colCount=0;
	 int count=0;
	Map<String,CarDetails> parkDetails;
	
	ParkingService()
	{
		parkDetails=new HashMap<>();
	}
	
	public String addCar(CarDetails car)
	{
		if(removeGetId.isEmpty()!=true)
		{
			
			String tId=removeGetId.getFirst();
			parkDetails.put(tId,car);
			removeGetId.removeFirst();
			return tId;
		}
	 if(count==10 && colCount==3) 
	 {
			rowCount++;
			colCount=0;
			count=0;
	}
	 else if(count==10)
	 {
		 colCount++;
		 count=0;
	 }
	 
		parkDetails.put(UtillityGenerateparkingId.getUniqueId(rowCount, colCount, count), car);
		count++;
		return UtillityGenerateparkingId.getUniqueId(rowCount, colCount, count-1);
		
	}
	
	public Set<CarDetails> getAllCarDetails()
	{
		return  (Set<CarDetails>) parkDetails.values();
		
	}
	
	public Set<String> getAllParkingDetails()
	{
		return  (Set<String>) parkDetails.keySet();
		
	}
	
	public Map<String, CarDetails> getAllDetails()
	{
		return parkDetails;
	}
	
	public CarDetails getCarDetailsById(String ticketId)
	{
		return parkDetails.get(ticketId);
	}
	
	public boolean removeById(String ticketId)
	{
		boolean state=parkDetails.remove(ticketId) != null;
		if(state)
			removeGetId.addLast(ticketId);
		return state;
		
		
	}
	
	public static void main(String[] args) {
		CarDetails car1=new CarDetails("Sanu", 90513);
		CarDetails car2=new CarDetails("ab", 90513);
		CarDetails car3=new CarDetails("fg", 90513);
		CarDetails car4=new CarDetails("fg", 90513);
		CarDetails car5=new CarDetails("fhgad", 90513);
		CarDetails car6=new CarDetails("gfj", 90513);
		CarDetails car7=new CarDetails("op", 90513);
		CarDetails car8=new CarDetails("xzc", 90513);
		CarDetails car9=new CarDetails("ewr", 90513);
		CarDetails car10=new CarDetails("lk", 90513);
		CarDetails car11=new CarDetails("vnbm", 90513);
		CarDetails car12=new CarDetails("tr", 90513);
		
		ParkingService parkingService=new ParkingService();
		System.out.println(parkingService.addCar(car1));
		System.out.println(parkingService.addCar(car2));
		System.out.println(parkingService.addCar(car3));
		System.out.println(parkingService.addCar(car4));
		System.out.println(parkingService.addCar(car5));
		System.out.println(parkingService.addCar(car6));
		System.out.println(parkingService.addCar(car7));
		System.out.println(parkingService.addCar(car8));
		System.out.println(parkingService.addCar(car9));
		System.out.println(parkingService.addCar(car10));
		System.out.println(parkingService.addCar(car11));
		System.out.println(parkingService.addCar(car12));
		System.out.println(parkingService.addCar(car7));
		System.out.println(parkingService.addCar(car8));
		System.out.println(parkingService.addCar(car9));
		System.out.println(parkingService.addCar(car10));
		System.out.println(parkingService.addCar(car11));
		System.out.println(parkingService.addCar(car12));
		System.out.println(parkingService.addCar(car9));
		System.out.println(parkingService.addCar(car10));
		System.out.println(parkingService.addCar(car11));
		System.out.println(parkingService.addCar(car12));
		System.out.println(parkingService.addCar(car7));
		System.out.println(parkingService.addCar(car8));
		System.out.println(parkingService.addCar(car9));
		System.out.println(parkingService.addCar(car10));
		System.out.println(parkingService.addCar(car11));
		System.out.println(parkingService.addCar(car12));
		
		System.out.println("==============================================================");
		
		for (Entry<String, CarDetails> pair : parkingService.getAllDetails().entrySet()) {
		   System.out.println("Key= "+pair.getKey()+" Value="+pair.getValue());
		}
		System.out.println("==============================================================");
		System.out.println(parkingService.getCarDetailsById("floor=0section=1compt=4"));
		
		
		System.out.println(parkingService.removeById("floor=0section=0compt=8"));
		System.out.println(parkingService.addCar(car10));
		
	}
	
	

}
