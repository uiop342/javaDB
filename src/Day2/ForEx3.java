package Day2;

public class ForEx3 {

	public static void main(String[] args) {
		System.out.println();
		/* �� ���� �ִ� ������� ���ϴ� �ڵ带 �ۼ��ϼ���.
		 * �ִ� ����� : �� ���� ����� �� ���� ū��
		 * ����� : �μ��� ����� ������ �����
		 * ��� : ������ �������� �� 4�� ����� 1,2,4
		 * 8�� 12�� �ִ� �����
		 * 8  : 1,2,4,8
		 * 12 : 1,2,4,6,12
		 * 8�� 12�� ������� : 1,2,4
		 * 8�� 12�� �ִ� �����  : 4
		 * */
		/* ������ ����� ���ϴ� �ڵ带 �ۼ��ϼ���.
		 * 1���� �ڱ� �ڽű��� ����� �������� 0�� �Ǹ� �� ���� ������ ����̴�.
		 * */
		int num=248;
		System.out.println(num+"�� ���");
		int i=0;
		for( i=1 ; i<=num ; i++ ){
			if(num%i==0)
			System.out.println(i+" ");
		}	
		int num1=12; int num2=8; int gcd=1;
		System.out.println(num1+"��"+num2+"�� �ִ� �����");
		for(i=1;i<=num1;i++){
			if(num1%i==0&&num2%i==0){
				gcd=i;
		}
		}
		System.out.println(gcd);
		int num3=15; int num4=30; int LCM=1;
		System.out.println(num3+"��"+num4+"�� �ּ� �����");
		for(i=1;i<=num3*num4;i++){
			if(i%num3==0&&i%num4==0){
				break;
		}System.out.println(i);
		}

		int cnt = 0;
		for( i=1 ; i<=num1*num2 ; i++ ){cnt++;
			if(i%num1==0&&i%num2==0){
				System.out.println("�ܼ� : "+i);
				break;
			}
		}
		System.out.println("�ܼ� �ݺ�Ƚ�� : "+cnt);
	}
	}
