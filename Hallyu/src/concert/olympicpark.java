package concert;

import java.util.Scanner;

public class olympicpark implements concerthall {

	public int secondNum;
	
	@Override
	public void moveAny() {
		System.out.println("�ø��Ȱ����� �����߽��ϴ�!");
	}
	
	public void secondQuiz() {
		System.out.println("1)������ 2)ī�� �������ּ���.");
	} //secondQuiz �߻�޼ҵ��� ��ü �޼ҵ�
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
