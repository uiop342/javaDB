package Day1;

public class IfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * if(���ǽ�){
		 * 	     ���๮;//���ǹ��� ���� �� ����˴ϴ�.
		 * }
		 * else if(���ǽ�2){
		 * 		���๮2;//���ǽ� 1�� �����̰�, ���ǽ�2�� ���ϰ�� �����
		 * }
		 * else{
		 *     ���๮2;//���ǽ�1�� ���ǽ�2�� ������ �� ����˴ϴ�.
		 * }
		 * if�� else if�� ������ �߿�*
		 * */
		int num = 11;
		// ���� num�� 0�̸� �ֿܼ� 0�Դϴٸ� ����ϼ���.
		if(num == 0){
			System.out.println("0�Դϴ�.");
		}
		// ���� num�� 0�� �ƴϰ�
		// num�� 2�� ��������� 0�� ���ٸ�(if���� ���ø����),
		// �ֿܼ� ¦���Դϴٸ� ����ϼ���
		else if(num%2==0){
		System.out.println(num+"�� ¦���Դϴ�");
		}
		// ���� num�� 0�� �ƴϰ� num�� 2�� ���������� 0�� ���� �ʴٸ�,
		// �ֿܼ� Ȧ���Դϴٸ� ����ϼ���
		else{
			System.out.println(num+"�� Ȧ���Դϴ�.");
		}
	}

}
