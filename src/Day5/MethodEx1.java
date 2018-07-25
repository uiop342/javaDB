package Day5;

import java.util.Scanner;

public class MethodEx1 {

	/* 메소드 : 특정 기능을 하도록 모아놓은 코드
	 * 메소드는 입력(매개변수)과 출력(리턴타입)이 필요하다.
	 * 그런데 상황에 따라서 입력과 출력이 필요 없을 수도 있다.
	 * (상황에따라서)접근제한자(public) 출력(void) 메소드이름(main)
	 * (매개변수들(string[] args)){
	 * 	       구현;
	 * }
	 * 자판기로 비유했을 때
	 * 기능(메소드) : 음료 자판기
	 * 입력(매개변수) : 돈, 선택메뉴
	 * 출력(리턴타입) : 선택된 음료수
	 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/* 두수와 연산자가 주어졌을 때 산술연산을 하는 코드를 작성하세요*/
		int num1=3; char x = '+';
		int num2=5; double res = 0.0;
		System.out.println("숫자1을 입력하세요.");
		num1 = scan.nextInt();
		System.out.println("숫자2을 입력하세요.");
		num2 = scan.nextInt();
		System.out.println("연산자를 입력하세요.");
		x = scan.next().charAt(0);
		if(x=='+'){
			res = num1+num2;
		}else if(x=='-'){
			res = num1-num2;
		}else if(x=='*'){
			res = num1*num2;
		}else if(x=='%'){
			res = (double)num1%num2;
		} else if (x=='/'){
			res = (double)num1/num2;
		}else{
			System.out.println("연산자를 잘못입력하였습니다.");
		}res = calculate(num1, num2, x);
		System.out.println(""+num1+" "+x+" "+num2+" = "+res);
		/* num1, num2, x가 매개변수
		 * res를 출력(리턴타입)
		 * 
		 * */
	}
	public static double calculate(int num1,int num2,char x){
		double res = 0.0;
		if(x=='+'){
			res = num1+num2;
		}else if(x=='-'){
			res = num1-num2;
		}else if(x=='*'){
			res = num1*num2;
		}else if(x=='%'){
			res = (double)num1%num2;
		} else if (x=='/'){
			res = (double)num1/num2;
		}else{
			System.out.println("연산자를 잘못입력하였습니다.");
		}System.out.println(""+num1+" "+x+" "+num2+" = "+res);
		return res;
	}
}
