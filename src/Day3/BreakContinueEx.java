package Day3;

public class BreakContinueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�̸��� �ִ� for�� break�� ����");
		
		Test:
		for(int j =1;j<=5;j++){
		for(int i =1;i<=5;i++){
			System.out.println("j"+j+",i="+i);
			if(i==4){
				break Test;
			}
		}
	  }
		System.out.println("continue�� ����");
		for(int j =1;j<=5;j++){
			for(int i =1;i<=5;i++){
				if(i==4){
					continue; //������ 1~4���� ǥ�������� ��Ƽ���� �̿��ϸ� �����ϰ� ��� �����������Ѵ�
				}
				System.out.println("j"+j+",i="+i);
			}
		  }
		/* 1���� 100���� ¦���� ���� continue���� �̿��Ͽ� �ۼ��ϼ���*/
		int sum=0;
		for(int i=1;i<=100;i++){
			/*
			 * if(i%2==0)
			 * sum+=i*/
			if(i%2==1)   //���࿡ i���� 2�� ���������� 1�Ͻ� continue�� �Ѿ��  
				continue; // ���⼭ continue�� �۵��ϰԵǸ� ������ 1�̵Ǵ� ��
			              // �� 'Ȧ��'�� ��ŵ�ϰ� ���� ������ �Ѵ�.
			sum+=i; // �׸��� i�� 2�� ����� 1�� �����ʴ°� '¦��'�̱⿡ continue���� �ɷ����� �ʴ� ��
			        // �� 'Ȧ��'�� �ƴҽ� sum = sum + i�� �۵���Ų��.
		}
		System.out.println(sum);
	}
}
