import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class CSVReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try 
		{
			HashMap<String, Integer> matchesPlayedPerYear = new HashMap<>();
			HashMap<String, HashMap<String, Integer>> matchesWonPerTeamPerYear;
			String path = "/home/jaguar/matches.csv";  
			String line = "";
			String keys[];
			
			FileReader file = new FileReader(path);
			BufferedReader br = new BufferedReader(file);
			while((line = br.readLine()) != null)
			{

				String matchesData[] = line.split(",");
				//System.out.println(matchesData[10]);
		
				if(matchesPlayedPerYear.containsKey(matchesData[1]))
				{		
					matchesPlayedPerYear.put(matchesData[1],matchesPlayedPerYear.get(matchesData[1]) + 1);
				}
				else
				{
					matchesPlayedPerYear.put(matchesData[1],1);
				}
				
//
//				if(matchesWonPerTeamPerYear.containsKey(matchesData[1]))
//				{
//					if(matchesWonPerTeamPerYear.containsKey(matchesData[10]))
//					{
//						matchesWonPerTeamPerYear.put();
//					}
//					else
//					{
//								
//					}
//				}
//				else
//				{
//					matchesWonPerTeamPerYear.put(matchesData[1], matchesWonPerTeamPerYear.put(matchesData[10],1));
//				}
			}
			br.close();
			//System.out.println(count);
			System.out.println(matchesPlayedPerYear);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	
//public void matchesPlayedPerYear() {
//	
//}

}



