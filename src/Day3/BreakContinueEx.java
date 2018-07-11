package Day3;

public class BreakContinueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이름이 있는 for문 break문 예제");
		
		Test:
		for(int j =1;j<=5;j++){
		for(int i =1;i<=5;i++){
			System.out.println("j"+j+",i="+i);
			if(i==4){
				break Test;
			}
		}
	  }
		System.out.println("continue문 예제");
		for(int j =1;j<=5;j++){
			for(int i =1;i<=5;i++){
				if(i==4){
					continue; //원래는 1~4까지 표현되지만 컨티뉴를 이용하면 무시하고 계속 증감연산을한다
				}
				System.out.println("j"+j+",i="+i);
			}
		  }
		/* 1부터 100까지 짝수의 합을 continue문을 이용하여 작성하세요*/
		int sum=0;
		for(int i=1;i<=100;i++){
			/*
			 * if(i%2==0)
			 * sum+=i*/
			if(i%2==1)   //만약에 i값과 2를 나누었을때 1일시 continue로 넘어간다  
				continue; // 여기서 continue를 작동하게되면 나눠서 1이되는 값
			              // 즉 '홀수'를 스킵하고 증감 연산을 한다.
			sum+=i; // 그리고 i와 2를 나누어서 1이 되지않는건 '짝수'이기에 continue에서 걸러지지 않는 값
			        // 즉 '홀수'가 아닐시 sum = sum + i를 작동시킨다.
		}
		System.out.println(sum);
	}
}
