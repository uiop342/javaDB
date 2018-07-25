package Day5;

import java.util.Scanner;

public class MathMethod {
		/* main메소드에 있는 num1,num2와
		 * GCD메소드에 있는 num1,num2는 서로 다른 변수이다.
		 * 메소드를 사용하는 이유
		 * 1. 코드의 중복을 최소화
		 * 2. 메소드를 재사용
		 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 최대공약수를 구하는 코드를 작성하세요. 
		 * */
		int num1=0;
		int num2=0;
		int i;
		int gcd=1;
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		for(i=1;i<=num1+num2;i++){
			if(num1%i==0&&num2%i==0){
				gcd=i;
			}
		}gcd = GCD(num1, num2);
		 int lcm = LCM(num1, num2);
		 System.out.println(num1+" 과(와) "+num2+" 의 최소공배수는 "+lcm);
	}/* 메소드명 : GCD
	         매개변수 : 두수 int num1, num2
	         리턴타입 : int
	    */
	public static int GCD(int num1,int num2){
		int gcd=1;
		for(int i=1;i<=num1+num2;i++){
			if(num1%i==0&&num2%i==0){
				gcd=i;
			}
		}System.out.println(num1+" 과(와) "+num2+" 의 최소공약수는 "+gcd);
	 	   return gcd;
	}
	public static int LCM(int num1,int num2){
		
		for(int i=1;i<=num1*num2;i++){
			if(i%num1==0&&i%num2==0){
				
				return i;//최소공배수 처음 하나값만 잡으면되니까 break를 걸어준다.
			}
		}
		return 1;
	}
	public static int LCM2(int num1,int num2){
		return num1*num2/GCD(num1,num2);
	}
	

}
