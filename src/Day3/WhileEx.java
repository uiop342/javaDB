package Day3;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1; //초기화;
		while(i<=5){ //조건식
			System.out.println("helloWorld"); //실행문;
			i++;//증감연산;
		}
		//표준입력방법
		/*Scanner scan =new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("num = "+num);
		double num2=scan.nextDouble();
		System.out.println("num2 = "+num2);
		char ch=scan.next().charAt(0); charAt(0)은 첫글자만 나오게해준다
		System.out.println("ch = "+ch);
		scan.close();*/
		Scanner scan = new Scanner(System.in);
		char mode ='a';
		while(!(mode !='q'||mode !='Q')){
			System.out.println("프로그램을 종료하려면 q또는 Q를 눌러주세요.");
			mode = scan.next().charAt(0);
		}
		System.out.println("프로그램을 종료합니다.");
	    scan.close();
	}
}
