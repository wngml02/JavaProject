package concert;

import java.util.Scanner;

public class jangchung implements concerthall{

	public int secondNum;
	
	@Override
	public void moveAny() {
		System.out.println("장충체육관에 도착했습니다!");
	}
	
	public void secondQuiz() {
		System.out.println("1)음식점 2)카페 선택해주세요.");
	} //secondQuiz 추상메소드의 실체 메소드
	public void setWhere() {
		Scanner sc = new Scanner(System.in);
		int where = sc.nextInt();
	}
	public void moveagain(int where) {
		if (where == 1) {
			restaurant restlist = new restaurant();
			restlist.view();
		} else {
			cafe cafelist = new cafe();
			cafelist.view();
		}
	}
}
