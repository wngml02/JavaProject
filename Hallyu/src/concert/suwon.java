package concert;

import java.util.List;
import java.util.Scanner;

public class suwon implements concerthall {
	public int secondNum;
	
	public void moveAny() {
		System.out.println("���������Ű���忡 �����߽��ϴ�!");
	}
	
	public void secondQuiz() {
		System.out.println("1)������ 2)ī�� �������ּ���.");
	} //secondQuiz �߻�޼ҵ��� ��ü �޼ҵ�
	
	public void setWhere() {
		hallLocation hallGo = null;
		hallGo = hallLocation.suwon;
		SecondOR whereGo = null;
		Scanner sc = new Scanner(System.in);
		int where = sc.nextInt();
		if (where == 1) {
			whereGo = SecondOR.restaurant;
			System.out.println(hallGo + " "+whereGo+"�� ����");
			List<List<String>> list = ReadCsv.readCSVFile("src/csvfile/swlist.csv");
		    for (List<String> line : list) {
		      System.out.println(String.join("||", line));
		    }
		} else {
			whereGo = SecondOR.cafe;
			System.out.println(hallGo + " "+whereGo+"�� ����");
			List<List<String>> list = ReadCsv.readCSVFile("src/csvfile/swcafe.csv");
		    for (List<String> line : list) {
		      System.out.println(String.join("||", line));
		    }
		}
		sc.close();
	 }

}
