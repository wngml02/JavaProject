package concert;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Goto Goto = new Goto();
		System.out.println("� �̵������� �̿��ϳ���?");
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
				System.out.println(trans+"�� �̵� ��..");
		}
		
		
		System.out.println("��� �������� ���ó���?");
		
		System.out.println("1)�ø��Ȱ��� 2)��ô��ī�̵� 3)������տ�� 4)���������Ű���� 5)��Ͽ����Ű����");
		int hall = scanner.nextInt(); //����ڿ��� ������ �Է¹ޱ�
		
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
			System.out.println("�ٽ� �������ּ���.");		
		} //������ ��ġ+��ȣ�� Ŭ���� ���� ��� �ޱ�
		
		ch.moveAny();
		ch.secondQuiz();
		ch.setWhere();
		
		scanner.close();
	}
	
}
