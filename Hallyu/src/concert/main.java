package concert;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("어디 공연장을 가시나요?");
		//for(hallLocation hl : hallLocation.values()) {
			//System.out.println(h1);
		//}\
		
		
		System.out.println("1)올림픽공원 2)고척스카이돔 3)잠실종합운동장 4)수원월드컵경기장 5)상암월드컵경기장");
		int hall = scanner.nextInt(); //사용자에게 공연장 입력받기
		
		concerthall ch = null;
		switch(hall) {
		case 1: ch = new olympicpark(); break;
		case 2: ch = new skydome(); break;
		case 3: ch = new jamsil(); break;
		case 4: ch = new suwon(); break;
		case 5: ch = new sangam(); break;
		default:
			System.out.println("다시 선택해주세요.");
		} //공연장 위치+번호에 클래스 따라 상속 받기
		
		ch.moveAny();
		ch.secondQuiz();
		ch.setWhere();
	}
}
