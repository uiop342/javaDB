package Day2;

public class ForEx4 {

	public static void main(String[] args) {
		/* �� ���� �ּ� ������� ���ϴ� �ڵ带 �ۼ��ϼ���.
		 * �ּ� ����� : �� ���� ������� �ּ��� �����
		 * ����� : �� ���� ����� �������� ���
		 * ��� : ����� ������ ����� �������� 0�� ��
		 * 10 : 10 20 30 40 50 60 70 ...
		 * 15 : 15 30 45 60 75 90 105 ...
		 * 10�� 15�� ����� : 30 60 90 ...
		 * 10�� 15�� �ּ� ����� : 30
		 * 1. �� ������ ������ ���� num1�� num2, �ݺ����� ����Ҽ��ִº���i�� �����Ѵ�.
		 * 2. i�� num1���� num1*num2���� i�� num1�� �����ϸ鼭 �ݺ��Ѵ�.
		 * 3. i�� num1�� ����̰�, i�� num2�� ����̸� i�� ���(�����)
		 * i�� ����ϰ�, �ݺ����� �����Ѵ�
		 * ����ÿ��� switch case���� ������ break���� ����Ѵ� (�ּ� �����)
		 * */
		int i=0; int num1=10; int num2=1111;
		int cnt = 0;
		for( i=1 ; i<=num1*num2 ; i++ ){cnt++;
			if(i%num1==0&&i%num2==0){
				System.out.println("�ܼ� : "+i);
				break;
			}
		}
		System.out.println("�ܼ� �ݺ�Ƚ�� : "+cnt);
			int tmpnum = num1;
			int div = num2;
			if(num2 > num1){
				tmpnum = num2;
				div = num1;
			}
		for(i=tmpnum;i<=num1*num2;i+=num1){
			cnt++;
			if(i%div==0){
				System.out.println("���� : "+i);
				break;
			}
		}
	System.out.println("���� �ݺ�Ƚ�� : "+cnt);
		for(i=num1;i<=num1*num2;i+=num1){cnt++;
			if(i%div==0){
				System.out.println("���� ���� : "+i);
				break;
			}
		}
	}
}