package concert;

import java.util.Scanner;

public class kintex implements concerthall{

	public int secondNum;
	
	@Override
	public void moveAny() {
		System.out.println("�ϻ� Ų�ؽ��� �����߽��ϴ�!");
	}
	
	public void secondQuiz() {
		System.out.println("1)������ 2)ī�� �������ּ���.");
	} //secondQuiz �߻�޼ҵ��� ��ü �޼ҵ�
	public void setWhere() {
		Scanner sc = new Scanner(System.in);
		int where = sc.nextInt();
		if (where == 1) {
			restaurant restlist = new restaurant();
			restlist.view();
		} else {
			cafe cafelist = new cafe();
			cafelist.view();
		}
	}
}
