package Day2;

public class ForEx4 {

	public static void main(String[] args) {
		/* 두 수의 최소 공배수를 구하는 코드를 작성하세요.
		 * 최소 공배수 : 두 수의 공배수중 최소인 공배수
		 * 공배수 : 두 수의 배수중 공통적인 배수
		 * 배수 : 배수를 정수로 나누어서 나머지가 0인 수
		 * 10 : 10 20 30 40 50 60 70 ...
		 * 15 : 15 30 45 60 75 90 105 ...
		 * 10과 15의 공배수 : 30 60 90 ...
		 * 10과 15의 최소 공배수 : 30
		 * 1. 두 정수를 저장할 변수 num1과 num2, 반복문에 사용할수있는변수i를 선언한다.
		 * 2. i는 num1부터 num1*num2까지 i가 num1씩 증가하면서 반복한다.
		 * 3. i는 num1의 배수이고, i가 num2의 배수이면 i를 출력(공배수)
		 * i를 출력하고, 반복문을 종료한다
		 * 종료시에는 switch case에서 쓰였던 break문을 사용한다 (최소 공배수)
		 * */
		int i=0; int num1=10; int num2=1111;
		int cnt = 0;
		for( i=1 ; i<=num1*num2 ; i++ ){cnt++;
			if(i%num1==0&&i%num2==0){
				System.out.println("단순 : "+i);
				break;
			}
		}
		System.out.println("단순 반복횟수 : "+cnt);
			int tmpnum = num1;
			int div = num2;
			if(num2 > num1){
				tmpnum = num2;
				div = num1;
			}
		for(i=tmpnum;i<=num1*num2;i+=num1){
			cnt++;
			if(i%div==0){
				System.out.println("많이 : "+i);
				break;
			}
		}
	System.out.println("많이 반복횟수 : "+cnt);
		for(i=num1;i<=num1*num2;i+=num1){cnt++;
			if(i%div==0){
				System.out.println("많이 생각 : "+i);
				break;
			}
		}
	}
}