package Day3;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 배열은 자료형이 같은 변수를 하나로 묶은 것으로,
		 * 동일한 목적의 변수이어야 한다.*/
		
		int num[] = new int[5];
		/* 1. 배열을 쓰면 반복문을 이용하기 편하다.
		 * 2. 배열의 값을 가져오기 위해서는 배열의 인덱스로
		 *    접근해야하는데 인덱스의 시작 번지는 0번지이다.
		 * 3. 배열의 마지막 인덱스값은 배열의 크기-1이다.
		 * */
		System.out.println("배열 기본 예제");
		for(int i=0; i<num.length;i++){
			num[1] = i+1;
		}
		for(int i=0;i<num.length;i++){
			System.out.println("num["+i+"] : " + num[i]);
		}
		int []num1,num3; //int[]이 공통으로 되어 num1,num3가 배열이됨
		int num2[],num4; //int가 공통이 되어 num2는 배열,num4는 일반변수가 되버림
		num1=new int[3]; //선언하고 바로 할당하지 않아도됨
		/* num1 : 배열
		 * num2 : 배열
		 * num3 : 배열
		 * num4 : 변수
		 * */
		Scanner scan = new Scanner(System.in);
		int size=scan.nextInt();
		if(size>=0)
			num1=new int[size];
		scan.close();
		int num5 [] = {1,2,3,4,5};
		System.out.println("초기화 예제");
		for(int i=0;i<num5.length;i++){
			System.out.println("num["+i+"] : "+num[i]);
		}
		int num6[];
		// num6={1,2,3,4,5};//초기화는 배열을 선얼할때에만 가능
	}

}
