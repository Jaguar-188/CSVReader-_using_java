import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class CSVReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try 
		{
			ArrayList<String> list=new ArrayList<String>();
			String path = "/home/jaguar/matches.csv";
			String line = "";
			//String data[] = new String[1000];
 			int count = 0;
			//System.out.println(path);
			FileReader file = new FileReader(path);
			BufferedReader br = new BufferedReader(file);
			while((line = br.readLine()) != null)
			{
				if(count != 0)
				{
					//System.out.println(line);
					//data[count] = line;
					list.add(line);
				}
				count = count + 1;
			}
			br.close();
			System.out.println(list);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
