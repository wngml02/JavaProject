package concert;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import concert.restaurant.ReadCsv;

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
			String filePath = "./oplist.csv";
		    List<List<String>> parsed = ReadCsv.parse(filePath);
		    for (List<String> line : parsed) {
		      System.out.println(String.join(",", line));
		    }
		} else {
			cafe cafelist = new cafe();
			CR.device(cafelist);
		}
	}
}
