package Day5;

import java.util.Scanner;

public class MathMethod {
		/* main�޼ҵ忡 �ִ� num1,num2��
		 * GCD�޼ҵ忡 �ִ� num1,num2�� ���� �ٸ� �����̴�.
		 * �޼ҵ带 ����ϴ� ����
		 * 1. �ڵ��� �ߺ��� �ּ�ȭ
		 * 2. �޼ҵ带 ����
		 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* �ִ������� ���ϴ� �ڵ带 �ۼ��ϼ���. 
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
		 System.out.println(num1+" ��(��) "+num2+" �� �ּҰ������ "+lcm);
	}/* �޼ҵ�� : GCD
	         �Ű����� : �μ� int num1, num2
	         ����Ÿ�� : int
	    */
	public static int GCD(int num1,int num2){
		int gcd=1;
		for(int i=1;i<=num1+num2;i++){
			if(num1%i==0&&num2%i==0){
				gcd=i;
			}
		}System.out.println(num1+" ��(��) "+num2+" �� �ּҰ������ "+gcd);
	 	   return gcd;
	}
	public static int LCM(int num1,int num2){
		
		for(int i=1;i<=num1*num2;i++){
			if(i%num1==0&&i%num2==0){
				
				return i;//�ּҰ���� ó�� �ϳ����� ������Ǵϱ� break�� �ɾ��ش�.
			}
		}
		return 1;
	}
	public static int LCM2(int num1,int num2){
		return num1*num2/GCD(num1,num2);
	}
	

}
