package Day2;

public class switchEx2 {

	public static void main(String[] args) {
        /* ���� ch�� a �Ǵ� A �̸� A �Դϴٶ�� �ֿܼ� ����ϰ�
         * ���� ch�� b �Ǵ� B �̸� B �Դϴٶ�� �ֿܼ� ����ϰ�
         * ���� ch�� a, A, b, B�� �ƴϸ� A�� B�� �ƴմϴ�
         * ��� �ֿܼ� ����ϴ� ������ switch case������ �ۼ��ϼ���.
         * */
        char ch='B';
        switch(ch){
        case'a'://ch�� ����'a'�̸�
        case'A'://ch�� ����'A'�̸�
        	System.out.println("A�Դϴ�.");
        	break;
        case'b'://ch�� ����'b'�̸�
        case'B'://ch�� ����'B'�̸�
        	System.out.println("B�Դϴ�.");
        	break;
        default:
        System.out.println("A�� B�� �ƴմϴ�");
        }
	}
}


