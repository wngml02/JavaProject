package concert;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// ���ڿ� �Է� ��Ʈ�� ��� Reader
public class ReadCsv {
	public static List<List<String>>readCSVFile(String filePath) {
	    List<List<String>> list = new ArrayList<>(); // ���� �迭Ÿ�԰� List �÷��� ������� csv ���� �б�
	    BufferedReader bufferedReader = null;
	    try {
	      bufferedReader = Files.newBufferedReader(Paths.get(filePath)); // ������ ��ġ�� ���� Ŭ���� ������� �ٸ� filePath
	      String line = "";
	      while ((line = bufferedReader.readLine()) != null) {
	    	List<String> stringList = new ArrayList<>();
	        String stringArray[] = line.split(",");
	        stringList = Arrays.asList(stringArray);
	        list.add(stringList); // csv������ , �� �߽����� �迭�� ��ġ
	      }
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }finally {
	    	try {
	    		assert bufferedReader != null;
	    		bufferedReader.close();
	    	} catch(IOException e) {
	    		e.printStackTrace();
	    	} // IOExceptrion ������ ���� ����ó�� ����
	    }

	    return list; // list return
	}
}

