package Day3;

import java.util.Scanner;

public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ������ ����� �迭�� �����ϴ� �ڵ带 �ۼ��ϼ���.
		 * �迭�� 10�������� �ϰ�, ����� 10���̻��� ������
		 * 10�������� ���Ѵ�.
		 * 12�� ����� 1,2,4,6,12
		 * 10�� ����� 1,2,5,10 ���
		 * 1.  �ʿ��� ���� ����
		 * 1.1 10��¥�� �迭 div����, �ݺ��� ����i����
		 *     ���� num����
		 * 2.  i�� 1���� num���� �۰ų� ���������� �ϳ��� 
		 *      �����ϸ鼭 �ݺ��� ����
		 * 3.  �ݺ��� �ȿ����� i�� num�� ����̸� i�� ���
		 * 3.1 i�� num�� ������ �ǹ̴� num�� i�� ���������� �������� 0�̶�� �ǹ��̴�. */
		int num=12;
		int i=0;
		int div[]=new int[10];
		int cnt=0;
		i=1;
		while(i<=num){
			if(num%i==0){
				//System.out.println(i);
				div[cnt]=i;
				//��� i�� �迭 div�� �����ϴµ�
				//��ġ�� ������� ã�� ����� ���������� ����
				//�׸��� ������ �Ŀ��� ����� ������ �ϳ� �����Ѵ�.
				cnt++;
				if(cnt==10)//���࿡ �ִ밹�� 10���� �޼��� ��� Break�� �Ἥ ����
					break;
			}
			i++;
		}
		i=0;
		while(i<cnt){
			System.out.print(div[i]+" ");
			i++;
		}
	}

}
