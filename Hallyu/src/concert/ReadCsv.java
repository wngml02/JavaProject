package concert;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// 문자열 입력 스트림 사용 Reader
public class ReadCsv {
	public static List<List<String>>readCSVFile(String filePath) {
	    List<List<String>> list = new ArrayList<>(); // 참조 배열타입과 List 컬랙션 사용으로 csv 파일 읽기
	    BufferedReader bufferedReader = null;
	    try {
	      bufferedReader = Files.newBufferedReader(Paths.get(filePath)); // 공연장 위치에 따라 클래스 상속으로 다른 filePath
	      String line = "";
	      while ((line = bufferedReader.readLine()) != null) {
	    	List<String> stringList = new ArrayList<>();
	        String stringArray[] = line.split(",");
	        stringList = Arrays.asList(stringArray);
	        list.add(stringList); // csv파일의 , 를 중심으로 배열로 배치
	      }
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }finally {
	    	try {
	    		assert bufferedReader != null;
	    		bufferedReader.close();
	    	} catch(IOException e) {
	    		e.printStackTrace();
	    	} // IOExceptrion 오류에 대한 예외처리 포함
	    }

	    return list; // list return
	}
}

