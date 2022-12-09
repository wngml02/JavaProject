package concert;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //보기 중 선택으로 입력받기
		
		Goto Goto = new Goto(); //이동수단 클래스로부터 객체 생성
		
		System.out.println("어떤 이동수단을 이용하나요?");
		System.out.println("Car/Bus/Subway");
		
		String trans = scanner.next(); //입력 받은 이동수단
		switch(trans) {
			case "Car", "car": Car car = new Car();
				Goto.go(car);
				break; //자동차
			case "Bus","bus": Bus bus = new Bus();
				Goto.go(bus);
				break; // 버스
			case "Subway","subway": Subway subway = new Subway();
				Goto.go(subway);
				break; // 지하철
			default:
				System.out.println(trans+"로 이동 중.."); // 기타 이동수단으로 이동 시
		} //입력받은 이동수단 case에 맞는 자식 클래스의 재정의된 메소드 호출 - 다형성
		
		
		concerthall ch = null;
		
		// 공연장 이동
		while(true) {
			System.out.println("어디 공연장을 가시나요?");
			System.out.println("1)올림픽공원 2)고척스카이돔 3)잠실종합운동장 4)수원월드컵경기장 5)상암월드컵경기장");
			
			int hall = scanner.nextInt(); //사용자에게 공연장 입력받기
			
			
			if (hall == 1) {
				ch = new olympicpark();break;
			} else if(hall ==2) {
				ch = new skydome();break;
			} else if(hall ==3) {
				ch = new jamsil();break;
			} else if(hall == 4) {
				ch = new suwon();break;
			} else if (hall == 5) {
				ch = new sangam();break; //공연장 위치+번호에 클래스 따라 상속 받기
			} else { 
				try {
					String str = null;
					System.out.println(str.toString());
				} catch(NullPointerException e) {
					System.out.println("NullPointerException 오류 발생");
					System.out.println("예외처리 진행..");
				} finally {
					System.out.println("예외처리 코드가 오류없이 진행되었습니다. 다시 실행됩니다. 1~5 사이에 선택해주세요.");
					System.out.println("...");
				} // 1~5가 아닌 다른 번호 선택시 처리하는 NullPointerException 오류 반복 질문과 함께 예외처리 진행
				
			}
			
		}
		// 메소드
		ch.moveAny();
		ch.secondQuiz();
		ch.setWhere();
		
		scanner.close();
	}
	
}
