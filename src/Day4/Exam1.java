package Day4;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		/* ���Ĺ���
		 * %d : ������
		 * %f, %lf : �Ǽ���
		 * %c : ������
		 * %s : ���ڿ�
		 * */
		System.out.printf("num : %d\n ",num);
		System.out.println("num : "+num);
		if(num%2==0){
			System.out.println("123");
		}
		/* ������ ���� num�� Ȧ���̸� Ȧ���Դϴٸ�
		 * ¦���̸� ¦���Դϴٸ� ����ϴ� �ڵ带 �ۼ��ϼ���*/
		int num1=10;
		if(num1%2==0){
			System.out.println("¦���Դϴ�.");
		}else{
			System.out.println("Ȧ���Դϴ�.");
		}
		//���� ��������� ���� ����� �� �� �ִ�.
		int mouth=4;
		switch(mouth){
		case 1: case 3: case 5: case 7: case 8: 
		case 10: case 12:
		//if(mouth==1||mouth==3||mouth==5||
        //   mouth==7||...||mouth==12)
			System.out.println("�������� : 31��");
			break;
		case 2:
			System.out.println("�������� : 28��");
			break;
			default:
			System.out.println("�������� : 30��");
		}
		/* 1���� 10������ ���� ���ϴ� �ڵ带 �ۼ��ϼ���. */
		int i=0;
		for(int sum=1;sum<=10;sum++){
			i = sum + i; 
		}System.out.println("1���� 10������ ���� : "+i);
		/* �ʱ�ȭ�� �ݺ����� ����� �� ó�� �ѹ��� ����
		 * ���ǽ��� ���̸� ���๮, ��������, ���ǽĺ񱳼����� �ݺ�
		 * ���ǽ��� �����̸� �ݺ��� ����
		 * */
		/* ���� num�� �Ҽ����� �ƴ��� �Ǻ��ϴ� �ڵ带 �ۼ��ϼ���. */
		int num5=5;
		int cnt=0;
		for(int o=1;o<=num5;o++){
			if(num5%o==0){
				cnt++; //�����⸦ �ݺ��ؼ� �������� ���� 0�� ������ 1�� ���� �� cnt�� �Ҽ���
			}
		}
		if(cnt==2){//cnt������ ���� 2�� �Ͻ� �Ҽ��Դϴٸ� ���
			System.out.println(num5+"��(��) �Ҽ��Դϴ�.");
		}else{
			System.out.println(num5+"��(��) �ռ����Դϴ�.");
		}
		/* �Ҽ��� ���ϴ� �ٸ� ���
		 * �Ҽ��� ����� ���� �����Ѵٸ� 1�̴�.
		 * ���� ������ ��� �� ���� ū ���� 1
		 * */
		int q, num6=7, div=0;
		for(i=num6;i>0;i--){
			if(num6 % i == 0){
				div = i;
				break;
			}
		}
		if(div == 1){
			System.out.println(num6+"�� �Ҽ�");
		}
		else{
			System.out.println(num6+"�� �ռ���");
		}
		/* �ִ� ������� ���ϴ� �ڵ带 �ۼ��Ͻÿ�.
		 * �� �� num2,num3, �ݺ��� ���� w, ����� gcd
		 * w�� 1���� num2���� �ݺ��ϰ� w�� num2�� num3��
		 * ����̸� ����� ������ w�� ����
		 * �ݺ����� �� ����� �� ����� ����ϸ� �װ� �ִ� ������̴�.*/
		int num2=30;
		int num3=15;
		int gcd = 1;
		int w = 1;
		for(w=1;w<=num2*num3;w++){
			if(num2%w==0&&num3%w==0){
				gcd = w;
			}
		}
		System.out.println(num2+"��(��)"+num3+"�� �ִ� ����� : "+gcd);
		int t = 0;
		int ct =0;
		for(t=0;t<10; t = t + 2 ){
			ct++;
		}System.out.println("�ݺ�Ƚ�� : "+ct+" ���� : "+t);//�ݺ�Ƚ�� 5��   ���� 10
		/* �ּ� ������� ���ϴ� �ڵ带 �ۼ��غ�����.*/
		int n1=15;
		int n2=20;
		int n=0;
		int lcm = 0;
		for(n=n1;n<=n1*n2;n+=n1){
			if(n%n1==0&&n%n2==0){
				lcm = n;
				break;
			}
		}System.out.println(n1+"��(��) "+n2+"�� "+"�ּҰ������ "+lcm);
		/* ****
		 * ****
		 * ****
		 * ****
		 * */
		Scanner scan = new Scanner(System.in);
		for(int s=1;s<=5;s++){
			for(int j=1;j<=5;j++){	
			 System.out.print("*");	
			}
			System.out.println();
		}System.out.println("_____________________________");
		int Q=5;
		for(int e=1;e<=Q;e++){
			for(int r=1;r<=e-1;r++){
				System.out.print(" ");
			}
			for(int j=1;j<=6-e;j++){
				System.out.print("*");
			}
			System.out.println();
		}System.out.println("-------------------------");
		for(int e=5;e>=1;e--){
			for(int r=1;r<=Q-e;r++){
				System.out.print(" ");
			}
			for(int j=1;j<=e;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		}
}
