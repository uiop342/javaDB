package Day2;

public class ForEx5 {

	public static void main(String[] args) {
		/* ������ �Ҽ����� �ƴ��� �Ǻ��ϴ� �ڵ带 �ۼ��ϼ���
		 * �Ҽ��� ����� 1�� �ڱ��ڽ��� ��
		 * => ��� 1 : ����� 2��
		 * => ��� 2 : �ڱ� �ڽ��� ���� ó������ ���� ����� 1�̸�
		 * �Ҽ� :2,3,5,7,11,17 ...
		 * 
		 * 1. i�� num1-1���� 1���� �ϳ��� �����ϸ鼭 �ݺ� 
		 * 2. num1�� i�� �������� �� �������� 0�̸� �ݺ��� ����
		 * 3. i�� 1�̸� �Ҽ�, �ƴϸ� �ռ���
		 * */
		
		
		//���1
		int i=0;
		int num1=13;
		int cnt=0;
		for(i=1;i<=num1;i++){
			if(num1%i==0){
				cnt++;
			}
		}
		if(cnt == 2){
			System.out.println(num1+"(��)�� �Ҽ�");
		}else{
				System.out.println(num1+"(��)�� �ռ���");
		}
		//���2
		for(i = num1-1; i >= 1; i--){
			if(num1%i==0){
				//�̶� i�� num1�� ������ ���� ū ����̴�.
				break;
			}
		}
			// i�� 1�̸� num1�� ������ ����� 1�̶�� �ǹ��̰�,
			// �̴� ����� 2����� �ǹ��̹Ƿ� �Ҽ��̴�.
			if(i == 1){
				System.out.println(num1+"(��)�� �Ҽ�");
			}else{
					System.out.println(num1+"(��)�� �ռ���");
			}
		for (i=1;i<0;i++){
			System.out.println(i);
			//���ѷ���
		}
	}

}
