package Day2;

public class ForEx3 {

	public static void main(String[] args) {
		System.out.println();
		/* 두 수의 최대 공약수를 구하는 코드를 작성하세요.
		 * 최대 공약수 : 두 수의 공약수 중 가장 큰수
		 * 공약수 : 두수의 약수중 공통인 약수를
		 * 약수 : 나누어 떨어지는 수 4의 약수는 1,2,4
		 * 8과 12의 최대 공약수
		 * 8  : 1,2,4,8
		 * 12 : 1,2,4,6,12
		 * 8과 12의 공약수는 : 1,2,4
		 * 8과 12의 최대 공약수  : 4
		 * */
		/* 정수의 약수를 구하는 코드를 작성하세요.
		 * 1부터 자기 자신까지 나누어서 나머지가 0이 되면 그 수는 정수의 약수이다.
		 * */
		int num=248;
		System.out.println(num+"의 약수");
		int i=0;
		for( i=1 ; i<=num ; i++ ){
			if(num%i==0)
			System.out.println(i+" ");
		}	
		int num1=12; int num2=8; int gcd=1;
		System.out.println(num1+"과"+num2+"의 최대 공약수");
		for(i=1;i<=num1;i++){
			if(num1%i==0&&num2%i==0){
				gcd=i;
		}
		}
		System.out.println(gcd);
		int num3=15; int num4=30; int LCM=1;
		System.out.println(num3+"과"+num4+"의 최소 공배수");
		for(i=1;i<=num3*num4;i++){
			if(i%num3==0&&i%num4==0){
				break;
		}System.out.println(i);
		}

		int cnt = 0;
		for( i=1 ; i<=num1*num2 ; i++ ){cnt++;
			if(i%num1==0&&i%num2==0){
				System.out.println("단순 : "+i);
				break;
			}
		}
		System.out.println("단순 반복횟수 : "+cnt);
	}
	}
