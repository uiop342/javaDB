package Day3;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* �迭�� �̿��Ͽ� �л� 5���� ������ Ű���带 ���� �Է¹ް� 
		 * ���� ������ ����ϴ� �ڵ带 �ۼ��ϼ���
		 * 1. �迭����
		 * 2. Scanner�� �̿��� scan����
		 * 3. �ݺ����� �̿��Ͽ� �л� ������ Ű����� �Է¹���
		 * 4. �ݺ����� �̿��Ͽ� �Է¹��� �л��� ������ ���*/
		int score[]= new int [5]; // score �ȿ� 0 ~ 4���� ������ ���ִ�
		Scanner scan = new Scanner(System.in); //�Ϲ��Է¸��� ����
		for(int i = 0; i <score.length;i++){ //i�� 0���� �Է°����ϰ� ����
			System.out.print("�л�"+(i+1)+"�� ������ �Է��ϼ��� : ");
			score[i]=scan.nextInt();
		}
		for(int i = 0; i <score.length;i++){
			System.out.println("�л�"+(i+1)+"�� ���� : "+score[i]);
		}
		/* �л����� ����� ���ϴ� �ڵ带 �ۼ��ϼ���.*/
		/*double avg=(score[0]+score[1]+score[2]+score[3]+score[4])/5.0;*/
		int sum = 0;
		double avg=0.0;
		for(int i =0; i<score.length;i++){
			sum += score[i]; //0~4������ ��簪�� ���Ѱ�  sum�� ������
			avg += (double)score[i]/score.length;
		}
		System.out.println("�л����� ��� ���� : "+(double)sum/5.0);
		System.out.println("�л����� ��� ���� : "+avg);
		}
}
