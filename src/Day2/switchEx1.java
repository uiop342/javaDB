package Day2;

public class switchEx1 {

	public static void main(String[] args) {
		/*switch(����){
		case ��1: //if(���� == ��1)			
			���๮;
			break; //break�� ���ٸ� ���๮ 2�� ����ǹ�����.
				   //break�� ������ �������� ��1�� �� ���๮ 1�� �����ϰ�
			       //break�� ���ٸ� �������� ��1�� �� ���๮ 1�� ���๮2�� ���� �����
			case ��2: //else(���� == ��1)
			���๮2;
			break;
		default: //else
			���๮3;
		*/
		/* num�� ���� 0�̸� �ֿܼ� 0�Դϴٶ�� ����ϰ�
		 * num�� ���� 1�̸� �ֿܼ� 1�Դϴٶ�� ����ϰ�
		 * num�� ���� 0�� 1�� �ƴϸ� �ֿܼ� 0�� 1�� �ƴմϴٶ�� ����ϴ� ����*/
		int num = 0;
		switch(num){
		case 1:
			System.out.println("1�Դϴ�.");
		break;
		case 0:
			System.out.println("0�Դϴ�.");
		break;                           //break�� ���������� 0�Դϴٿ� 0�� 1�� �ƴմϴ�
		default:   						 //��� ���� ���ÿ� ��µȴ�.
			System.out.println("0�� 1�� �ƴմϴ�.");
		}
	}

}
