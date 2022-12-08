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
		System.out.println("올림픽공원에 도착했습니다!");
	}
	
	public void secondQuiz() {
		System.out.println("1)음식점 2)카페 선택해주세요.");
	} //secondQuiz 추상메소드의 실체 메소드
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
