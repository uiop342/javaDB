package Day4;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10;
		/* 서식문자
		 * %d : 정수형
		 * %f, %lf : 실수형
		 * %c : 문자형
		 * %s : 문자열
		 * */
		System.out.printf("num : %d\n ",num);
		System.out.println("num : "+num);
		if(num%2==0){
			System.out.println("123");
		}
		/* 정수형 변수 num이 홀수이면 홀수입니다를
		 * 짝수이면 짝수입니다를 출력하는 코드를 작성하세요*/
		int num1=10;
		if(num1%2==0){
			System.out.println("짝수입니다.");
		}else{
			System.out.println("홀수입니다.");
		}
		//값은 정수상수와 문자 상수만 올 수 있다.
		int mouth=4;
		switch(mouth){
		case 1: case 3: case 5: case 7: case 8: 
		case 10: case 12:
		//if(mouth==1||mouth==3||mouth==5||
        //   mouth==7||...||mouth==12)
			System.out.println("마지막날 : 31일");
			break;
		case 2:
			System.out.println("마지막날 : 28일");
			break;
			default:
			System.out.println("마지막날 : 30일");
		}
		/* 1부터 10까지의 합을 구하는 코드를 작성하세요. */
		int i=0;
		for(int sum=1;sum<=10;sum++){
			i = sum + i; 
		}System.out.println("1부터 10까지의 합은 : "+i);
		/* 초기화는 반복문이 실행될 때 처음 한번만 실행
		 * 조건식이 참이면 실행문, 증감연산, 조건식비교순으로 반복
		 * 조건식이 거짓이면 반복문 종료
		 * */
		/* 정수 num가 소수인지 아닌지 판별하는 코드를 작성하세요. */
		int num5=5;
		int cnt=0;
		for(int o=1;o<=num5;o++){
			if(num5%o==0){
				cnt++; //나누기를 반복해서 나눠져서 값이 0이 나오면 1씩 증가 즉 cnt는 소수값
			}
		}
		if(cnt==2){//cnt내부의 값이 2개 일시 소수입니다를 출력
			System.out.println(num5+"는(은) 소수입니다.");
		}else{
			System.out.println(num5+"는(은) 합성수입니다.");
		}
		/* 소수를 구하는 다른 방법
		 * 소수의 약수는 나를 제외한다면 1이다.
		 * 나를 제외한 약수 중 가장 큰 수가 1
		 * */
		int q, num6=7, div=0;
		for(i=num6;i>0;i--){
			if(num6 % i == 0){
				div = i;
				break;
			}
		}
		if(div == 1){
			System.out.println(num6+"는 소수");
		}
		else{
			System.out.println(num6+"는 합성수");
		}
		/* 최대 공약수를 구하는 코드를 작성하시오.
		 * 두 수 num2,num3, 반복문 변수 w, 공약수 gcd
		 * w가 1부터 num2까지 반복하고 w가 num2과 num3의
		 * 약수이면 공약수 변수에 w를 저장
		 * 반복문이 다 종료된 후 공약수 출력하면 그게 최대 공약수이다.*/
		int num2=30;
		int num3=15;
		int gcd = 1;
		int w = 1;
		for(w=1;w<=num2*num3;w++){
			if(num2%w==0&&num3%w==0){
				gcd = w;
			}
		}
		System.out.println(num2+"과(와)"+num3+"의 최대 공약수 : "+gcd);
		int t = 0;
		int ct =0;
		for(t=0;t<10; t = t + 2 ){
			ct++;
		}System.out.println("반복횟수 : "+ct+" 값은 : "+t);//반복횟수 5번   값은 10
		/* 최소 공배수를 구하는 코드를 작성해보세요.*/
		int n1=15;
		int n2=20;
		int n=0;
		int lcm = 0;
		for(n=n1;n<=n1*n2;n+=n1){
			if(n%n1==0&&n%n2==0){
				lcm = n;
				break;
			}
		}System.out.println(n1+"과(와) "+n2+"의 "+"최소공배수는 "+lcm);
		/* ****
		 * ****
		 * ****
		 * ****
		 * */
		Scanner scan = new Scanner(System.in);
		for(int s=1;s<=5;s++){
			for(int j=1;j<=5;j++){	
			 System.out.print("*");	
			}
			System.out.println();
		}System.out.println("_____________________________");
		int Q=5;
		for(int e=1;e<=Q;e++){
			for(int r=1;r<=e-1;r++){
				System.out.print(" ");
			}
			for(int j=1;j<=6-e;j++){
				System.out.print("*");
			}
			System.out.println();
		}System.out.println("-------------------------");
		for(int e=5;e>=1;e--){
			for(int r=1;r<=Q-e;r++){
				System.out.print(" ");
			}
			for(int j=1;j<=e;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		}
}
