package concert;

import java.util.List;
import java.util.Scanner;

public class jamsil implements concerthall{
	
	public int secondNum;
	
	@Override
	public void moveAny() {
		System.out.println("������տ�忡 �����߽��ϴ�!");
	}
	
	public void secondQuiz() {
		System.out.println("1)������ 2)ī�� �������ּ���.");
	} //secondQuiz �߻�޼ҵ��� ��ü �޼ҵ�
	public void setWhere() {
		hallLocation hallGo = null;
		hallGo = hallLocation.jamsil;
		SecondOR whereGo = null;
		Scanner sc = new Scanner(System.in);
		int where = sc.nextInt();
		if (where == 1) {
			whereGo = SecondOR.restaurant;
			System.out.println(hallGo + " "+whereGo+"�� ����");
			List<List<String>> list = ReadCsv.readCSVFile("src/csvfile/jslist.csv");
		    for (List<String> line : list) {
		      System.out.println(String.join("||", line));
		    }
		} else {
			whereGo = SecondOR.cafe;
			System.out.println(hallGo + " "+whereGo+"�� ����");
			List<List<String>> list = ReadCsv.readCSVFile("src/csvfile/jscafe.csv");
		    for (List<String> line : list) {
		      System.out.println(String.join("||", line));
		    }
		}
		sc.close();
	 }
}
