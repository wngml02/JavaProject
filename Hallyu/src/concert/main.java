package concert;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��� �������� ���ó���?");
		//for(hallLocation hl : hallLocation.values()) {
			//System.out.println(h1);
		//}\
		
		
		System.out.println("1)�ø��Ȱ��� 2)��ô��ī�̵� 3)������տ�� 4)���������Ű���� 5)��Ͽ����Ű����");
		int hall = scanner.nextInt(); //����ڿ��� ������ �Է¹ޱ�
		
		concerthall ch = null;
		switch(hall) {
		case 1: ch = new olympicpark(); break;
		case 2: ch = new skydome(); break;
		case 3: ch = new jamsil(); break;
		case 4: ch = new suwon(); break;
		case 5: ch = new sangam(); break;
		default:
			System.out.println("�ٽ� �������ּ���.");
		} //������ ��ġ+��ȣ�� Ŭ���� ���� ��� �ޱ�
		
		ch.moveAny();
		ch.secondQuiz();
		ch.setWhere();
	}
}
