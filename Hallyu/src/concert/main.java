package concert;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Goto Goto = new Goto();
		System.out.println("어떤 이동수단을 이용하나요?");
		System.out.println("Car/Bus/Subway");
		String trans = scanner.next();
		switch(trans) {
			case "Car", "car": Car car = new Car();
				Goto.go(car);
				break;
			case "Bus","bus": Bus bus = new Bus();
				Goto.go(bus);
				break;
			case "Subway","subway": Subway subway = new Subway();
				Goto.go(subway);
				break;
			default:
				System.out.println(trans+"로 이동 중..");
		}
		
		
		System.out.println("어디 공연장을 가시나요?");
		
		System.out.println("1)올림픽공원 2)고척스카이돔 3)잠실종합운동장 4)수원월드컵경기장 5)상암월드컵경기장");
		int hall = scanner.nextInt(); //사용자에게 공연장 입력받기
		
		try {
			
		}
		
		concerthall ch = null;
		switch(hall) {
		case 1: ch = new olympicpark(); break;
		case 2: ch = new skydome(); break;
		case 3: ch = new jamsil(); break;
		case 4: ch = new suwon(); break;
		case 5: ch = new sangam(); break;
		catch(NullPointerException e) {
			System.out.println("다시 선택해주세요.");		
		} //공연장 위치+번호에 클래스 따라 상속 받기
		
		ch.moveAny();
		ch.secondQuiz();
		ch.setWhere();
		
		scanner.close();
	}
	
}
