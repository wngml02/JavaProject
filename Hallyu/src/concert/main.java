package concert;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��� �������� ���ó���?");
		System.out.println("1)�ø��Ȱ��� 2)��ô��ī�̵� 3)������տ�� 4)���������Ű���� 5)��Ͽ����Ű���� 6)����ü���� 7)�ϻ�Ų�ؽ�");
		int hall = scanner.nextInt(); //����ڿ��� ������ �Է¹ޱ�
		
		concerthall ch;
		switch(hall) {
		case 1:
			ch = new olympicpark();
			break;
		case 2:
			ch = new skydome();
			break;
		case 3:
			ch = new suwon();
			break;
		case 4:
			ch = new sangam();
			break;
		case 5:
			ch = new jamsil();
			break;
		case 6:
			ch = new kintex();
			break;
		case 7:
			ch = new jangchung();
			break;
		default:
			System.out.println("�ٽ� �������ּ���.");
		}

scanner.close();
}
}
