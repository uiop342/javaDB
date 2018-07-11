package Day3;

public class LoopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 무한루프가 생성되는 경우
		 * 1. 가장 기본적인 무한루프 만드는 방법
		 * */
		/*for (;;){
			System.out.println("HelloWorld");
		}*/
		/*2. 잘못된 초기화로 인한 무한루프*/
		/*int i = 1;
		for(i=11;i>=10;i++){
			System.out.println("HelloWorld");	
		}*/
		/*3. 잘못된 조건식으로 인한 무한루프*/
		/*int i=1;
		for(i=1;i>=1;i++){
			System.out.println("HelloWorld");
		}*/
		/*4. 잘못된 증감연산으로 인한 무한루프*/
		/*int i=1;
		for(i=1;i<=10;i--){
			System.out.println("HelloWorld");
		}*/
		/*반복문 실행이 한번도 안되는 경우
		 * 1. 변수 초기화를 잘못한 경우*/
		/*for (int i=1;i<=10;i++){
			System.out.println("helloworld");
		}*/
		/*2. 변수 초기화를 하지 않은 경우*/
		/*int i=0;
		for (i=1;i<=10;i++){
			System.out.println("Helloworld");
		}
		
		for (;i<=10;i++){
			System.out.println("helloworld1");
		}*/
		/*3. 조건식을 잘못한 경우*/
		/*for (int i=1;i>=10;i++){
			System.out.println("helloworld");
		}*/
		
	}

}
