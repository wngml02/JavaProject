package concert;

import java.util.List;
import java.util.Scanner;

public class skydome implements concerthall {

	public int secondNum;
	
	@Override
	public void moveAny() {
		System.out.println("고척스카이돔에 도착했습니다!");
	}
	
	public void secondQuiz() {
		System.out.println("1)음식점 2)카페 선택해주세요.");
	} //secondQuiz 추상메소드의 실체 메소드
	public void setWhere() {
		Scanner sc = new Scanner(System.in);
		int where = sc.nextInt();
		if (where == 1) {
			List<List<String>> list = ReadCsv.readCSVFile("src/csvfile/skylist.csv");
		    for (List<String> line : list) {
		      System.out.println(String.join("||", line));
		    }
		} else {
			List<List<String>> list = ReadCsv.readCSVFile("src/csvfile/skycafe.csv");
		    for (List<String> line : list) {
		      System.out.println(String.join("||", line));
		    }
		}
	 }
}
