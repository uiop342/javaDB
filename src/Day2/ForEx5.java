package Day2;

public class ForEx5 {

	public static void main(String[] args) {
		/* 정수가 소수인지 아닌지 판별하는 코드를 작성하세요
		 * 소수는 약수가 1과 자기자신인 수
		 * => 방법 1 : 약수가 2개
		 * => 방법 2 : 자기 자신을 빼고 처음으로 구한 약수가 1이면
		 * 소수 :2,3,5,7,11,17 ...
		 * 
		 * 1. i는 num1-1부터 1까지 하나씩 감소하면서 반복 
		 * 2. num1을 i로 나누었을 때 나머지가 0이면 반복문 종료
		 * 3. i가 1이면 소수, 아니면 합성수
		 * */
		
		
		//방법1
		int i=0;
		int num1=13;
		int cnt=0;
		for(i=1;i<=num1;i++){
			if(num1%i==0){
				cnt++;
			}
		}
		if(cnt == 2){
			System.out.println(num1+"(은)는 소수");
		}else{
				System.out.println(num1+"(은)는 합성수");
		}
		//방법2
		for(i = num1-1; i >= 1; i--){
			if(num1%i==0){
				//이때 i가 num1을 제외한 가장 큰 약수이다.
				break;
			}
		}
			// i가 1이면 num1을 제외한 약수가 1이라는 의미이고,
			// 이는 약수가 2개라는 의미이므로 소수이다.
			if(i == 1){
				System.out.println(num1+"(은)는 소수");
			}else{
					System.out.println(num1+"(은)는 합성수");
			}
		for (i=1;i<0;i++){
			System.out.println(i);
			//무한루프
		}
	}

}
