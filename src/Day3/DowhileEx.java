package Day3;

import java.util.Scanner;

public class DowhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char mode='q';
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("�޴�");
			System.out.println("1. �л������߰�");
			System.out.println("2. �л��������");
			System.out.println("q. ���α׷� ����");
			System.out.println("�޴��� �����ϼ���.");
			mode =scan.next().charAt(0);
		}while(mode !='q'); // �Է¹޴� ���� q�� �ƴҽ� �ݺ��մϴ�.
		System.out.println("���α׷��� �����մϴ�.");
	}

}
