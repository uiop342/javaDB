package Day5;

import java.util.Scanner;

public class MethodEx1 {

	/* �޼ҵ� : Ư�� ����� �ϵ��� ��Ƴ��� �ڵ�
	 * �޼ҵ�� �Է�(�Ű�����)�� ���(����Ÿ��)�� �ʿ��ϴ�.
	 * �׷��� ��Ȳ�� ���� �Է°� ����� �ʿ� ���� ���� �ִ�.
	 * (��Ȳ������)����������(public) ���(void) �޼ҵ��̸�(main)
	 * (�Ű�������(string[] args)){
	 * 	       ����;
	 * }
	 * ���Ǳ�� �������� ��
	 * ���(�޼ҵ�) : ���� ���Ǳ�
	 * �Է�(�Ű�����) : ��, ���ø޴�
	 * ���(����Ÿ��) : ���õ� �����
	 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/* �μ��� �����ڰ� �־����� �� ��������� �ϴ� �ڵ带 �ۼ��ϼ���*/
		int num1=3; char x = '+';
		int num2=5; double res = 0.0;
		System.out.println("����1�� �Է��ϼ���.");
		num1 = scan.nextInt();
		System.out.println("����2�� �Է��ϼ���.");
		num2 = scan.nextInt();
		System.out.println("�����ڸ� �Է��ϼ���.");
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
			System.out.println("�����ڸ� �߸��Է��Ͽ����ϴ�.");
		}res = calculate(num1, num2, x);
		System.out.println(""+num1+" "+x+" "+num2+" = "+res);
		/* num1, num2, x�� �Ű�����
		 * res�� ���(����Ÿ��)
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
			System.out.println("�����ڸ� �߸��Է��Ͽ����ϴ�.");
		}System.out.println(""+num1+" "+x+" "+num2+" = "+res);
		return res;
	}
}
