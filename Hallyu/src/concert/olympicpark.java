package concert;

import java.util.Scanner;

public class olympicpark implements concerthall {

	public int secondNum;
	
	@Override
	public void moveAny() {
		System.out.println("올림픽공원에 도착했습니다!");
	}
	
	public void secondQuiz() {
		System.out.println("1)음식점 2)카페 선택해주세요.");
	} //secondQuiz 추상메소드의 실체 메소드
	public void setWhere() {
		cafeORrest CR = new cafeORrest();
		Scanner sc = new Scanner(System.in);
		int where = sc.nextInt();
		if (where == 1) {
			restaurant restlist = new restaurant();
			CR.device(restlist);
		} else {
			cafe cafelist = new cafe();
			CR.device(cafelist);
		}
	}
}
