package concert;

import java.util.List;
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
		hallLocation hallGo = null;
		hallGo = hallLocation.olympicpark;
		SecondOR whereGo = null;
		Scanner sc = new Scanner(System.in);
		int where = sc.nextInt();
		if (where == 1) {
			whereGo = SecondOR.restaurant;
			System.out.println(hallGo + " "+whereGo+"�� ����");
			List<List<String>> list = ReadCsv.readCSVFile("src/csvfile/oplist.csv");
		    for (List<String> line : list) {
		      System.out.println(String.join("||", line));
		    }
		} else {
			whereGo = SecondOR.cafe;
			System.out.println(hallGo + " "+whereGo+"�� ����");
			List<List<String>> list = ReadCsv.readCSVFile("src/csvfile/opcafe.csv");
		    for (List<String> line : list) {
		      System.out.println(String.join("||", line));
		    }
		}
		sc.close();
	 }
	
}
