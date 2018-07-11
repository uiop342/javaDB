package Day3;

import java.util.Scanner;

public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 정수의 약수를 배열에 저장하는 코드를 작성하세요.
		 * 배열은 10개까지로 하고, 약수의 10개이상인 수들은
		 * 10개까지만 구한다.
		 * 12의 약수는 1,2,4,6,12
		 * 10의 약수는 1,2,5,10 등등
		 * 1.  필요한 변수 선언
		 * 1.1 10개짜리 배열 div선언, 반복문 변수i선언
		 *     정수 num선언
		 * 2.  i는 1부터 num보다 작거나 같을때까지 하나씩 
		 *      증가하면서 반복문 실행
		 * 3.  반복문 안에서는 i가 num의 약수이면 i를 출력
		 * 3.1 i가 num의 약수라는 의미는 num를 i로 나누었을때 나머지가 0이라는 의미이다. */
		int num=12;
		int i=0;
		int div[]=new int[10];
		int cnt=0;
		i=1;
		while(i<=num){
			if(num%i==0){
				//System.out.println(i);
				div[cnt]=i;
				//약수 i를 배열 div에 저장하는데
				//위치는 현재까지 찾은 약수의 갯수번지에 저장
				//그리고 저장한 후에는 약수의 갯수를 하나 증가한다.
				cnt++;
				if(cnt==10)//만약에 최대갯수 10개가 달성될 경우 Break를 써서 멈춤
					break;
			}
			i++;
		}
		i=0;
		while(i<cnt){
			System.out.print(div[i]+" ");
			i++;
		}
	}

}
