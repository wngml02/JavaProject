package concert;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class restaurant extends concertmove {
	public class ReadCsv{
		public static List<List<String>> parse(String filePath) {
		    List<List<String>> result = new ArrayList<>();

		    try {
		      File csvFile = new File(filePath);
		      FileReader fr = new FileReader(csvFile);
		      BufferedReader br = new BufferedReader(fr);

		      String line;
		      while ((line = br.readLine()) != null) {
		        String[] parsed = line.split(",");
		        result.add(Arrays.asList(parsed));
		      }
		    } catch (FileNotFoundException e) {
		      // caused by: FileReader fr = new FileReader(csvFile);
		    } catch (IOException e) {
		      // caused by: (line = br.readLine()) != null
		    }

		    return result;
		  }
	}
}