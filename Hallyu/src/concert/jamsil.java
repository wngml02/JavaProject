package concert;

import java.util.List;
import java.util.Scanner;

public class jamsil implements concerthall{
	// �������̽��� ����� �߻� �޼ҵ��� ��ü�޼ҵ� ����
	
	//�ʵ�
	public int secondNum;
	
	
	@Override //�������̽� ������ �޼ҵ� �������̵�
	public void moveAny() {
		System.out.println("������տ�忡 �����߽��ϴ�!");
	}//moveAny �߻�޼ҵ��� ��ü �޼ҵ�
	
	public void secondQuiz() {
		System.out.println("1)������ 2)ī�� �������ּ���.");
	} //secondQuiz �߻�޼ҵ��� ��ü �޼ҵ�
	
	public void setWhere() {
		hallLocation hallGo = null;
		hallGo = hallLocation.jamsil; // ���� ����Ÿ�� ������� �ܼ�Ʈ ��ġ ���� ����
		SecondOR whereGo = null;
		Scanner sc = new Scanner(System.in); // ī��� ������� �� ���� �Է¹ޱ�
		int where = sc.nextInt();
		if (where == 1) { // ������� ���� ��
			whereGo = SecondOR.restaurant; // ���� ����Ÿ�� ���� ����
			System.out.println(hallGo + " "+whereGo+"�� ����"); // �޾ƿ� ����Ÿ������ ���� ����
			List<List<String>> list = ReadCsv.readCSVFile("src/csvfile/jslist.csv"); // ������� ������ �ִ� csv ���� �޾ƿ���
		    for (List<String> line : list) {
		      System.out.println(String.join("||", line));
		    } // csv ���� ����-List �÷��������ӿ�ũ ���
		} else {
			whereGo = SecondOR.cafe; // ī�� ���� ��
			System.out.println(hallGo + " "+whereGo+"�� ����");  // �޾ƿ� ����Ÿ������ ���� ����
			List<List<String>> list = ReadCsv.readCSVFile("src/csvfile/jscafe.csv"); //ī�� ������ �ִ� csv ���� �޾ƿ���
		    for (List<String> line : list) {
		      System.out.println(String.join("||", line));
		    } // csv ���� ����-List �÷��������ӿ�ũ ���
		}
		sc.close();
	 }
}
