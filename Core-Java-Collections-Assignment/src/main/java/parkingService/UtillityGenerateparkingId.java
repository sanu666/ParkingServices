package parkingService;

public class UtillityGenerateparkingId {
	
	static String getUniqueId(int row,int col,int count)
	{
		String floor=Integer.toString(row);
		String sec=Integer.toString(col);
		String counter=Integer.toString(count);
		return ("floor="+floor+"section="+sec+"compt="+counter);
	}

}
