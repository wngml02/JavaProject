package concert;

public class Subway extends transportation{ 
	// 클래스 상속
	@Override //메소드 재정의(오버라이딩)
	public void move() {
		System.out.println("지하철로 이동 중..");
	}
}
