package Day3;

import java.util.Scanner;

public class DowhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char mode='q';
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("메뉴");
			System.out.println("1. 학생정보추가");
			System.out.println("2. 학생정보출력");
			System.out.println("q. 프로그램 종료");
			System.out.println("메뉴를 선택하세요.");
			mode =scan.next().charAt(0);
		}while(mode !='q'); // 입력받는 값이 q가 아닐시 반복합니다.
		System.out.println("프로그램을 종료합니다.");
	}

}
