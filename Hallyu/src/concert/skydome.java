package concert;

import java.util.List;
import java.util.Scanner;

public class skydome implements concerthall {
	// 인터페이스에 선언된 추상 메소드의 실체메소드 선언
	
	//필드
	public int secondNum;
	
	@Override //인터페이스 다형성 메소드 오버라이딩
	public void moveAny() {
		System.out.println("고척스카이돔에 도착했습니다!");
	} //moveAny 추상메소드의 실체 메소드
	
	public void secondQuiz() {
		System.out.println("1)음식점 2)카페 선택해주세요.");
	} //secondQuiz 추상메소드의 실체 메소드
	public void setWhere() {
		hallLocation hallGo = null;
		hallGo = hallLocation.skydome; // 참조 열거타입 사용으로 콘서트 위치 정보 제공
		SecondOR whereGo = null;
		Scanner sc = new Scanner(System.in); // 카페와 레스토랑 중 선택 입력받기
		int where = sc.nextInt();
		if (where == 1) { // 레스토랑 선택 시
			whereGo = SecondOR.restaurant; // 참조 열거타입 정보 제공
			System.out.println(hallGo + " "+whereGo+"의 정보"); // 받아온 참조타입으로 정보 제시
			List<List<String>> list = ReadCsv.readCSVFile("src/csvfile/skylist.csv"); // 레스토랑 정보가 있는 csv 파일 받아오기
		    for (List<String> line : list) {
		      System.out.println(String.join("||", line));
		    } // csv 정보 제공-List 컬렉션프레임워크 사용
		} else {
			whereGo = SecondOR.cafe; // 카페 선택 시
			System.out.println(hallGo + " "+whereGo+"의 정보");  // 받아온 참조타입으로 정보 제시
			List<List<String>> list = ReadCsv.readCSVFile("src/csvfile/skycafe.csv"); //카페 정보가 있는 csv 파일 받아오기
		    for (List<String> line : list) {
		      System.out.println(String.join("||", line));
		    }
		} // csv 정보 제공-List 컬렉션프레임워크 사용
		sc.close();
	 }
}
